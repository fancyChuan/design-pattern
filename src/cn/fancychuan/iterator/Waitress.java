package cn.fancychuan.iterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    // public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {// 这里还有一个优化的地方，构造的时候使用了具体类，我们可以新增一个接口
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) { // 增加了Menu之后就更加简洁
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();

        System.out.println("MENU\n----\n早餐：");
        printMenu(pancakeIterator);
        System.out.println("MENU\n----\n晚餐：");
        printMenu(dinerIterator);
        System.out.println("MENU\n----\n咖啡：");
        printMenu(cafeIterator);

    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
