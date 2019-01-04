package cn.fancychuan.composite;

/**
 * 20190104 组合模式
 *
 * 菜单项MenuItem只需要打印出每个菜单就好。而菜单组合 Menu 的打印任务就需要把把下面的菜单项MenuItem生成迭代器，然后依次调用MenuItem.print()
 *
 * 这是一种树形结构，需要有一个公共的类型（抽象类），这个抽象类被菜单项和菜单组合所继承。
 * 在节点层面，只需要针对抽象类MenuComponent编程，并不需要针对具体实现Menu和MenuItem编程。
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pacake menu", "breakfast菜单");
        MenuComponent dinnerMenu = new Menu("Diner menu", "Lunck菜单");
        MenuComponent cafeMenu = new Menu("Cafe menu", "Dinner菜单");

        MenuComponent dessertMenu = new Menu("Dessert menu", "甜点子菜单");

        MenuComponent allMenus = new Menu("All menus", "这是所有菜单啊");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        // 配置每个店的菜单
        pancakeHouseMenu.add(new MenuItem("A", "这是A", true, 12.25));
        pancakeHouseMenu.add(new MenuItem("B", "这是B", false, 13.25));
        pancakeHouseMenu.add(new MenuItem("C", "这是C", true, 14.25));

        dinnerMenu.add(new MenuItem("a", "这是a", true, 12.25));
        dinnerMenu.add(dessertMenu); // 加入一个子菜单
        dessertMenu.add(new MenuItem("t1", "这是甜点1", false, 11.22));
        dessertMenu.add(new MenuItem("t2", "这是甜点2", true, 11.33));

        cafeMenu.add(new MenuItem("f1", "这是咖啡1", false, 12.25));
        cafeMenu.add(new MenuItem("f2", "这是咖啡2", true, 18.25));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
