package cn.fancychuan.iterator;

public class Main {

    public static void testIterator() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu(); // 这里用了多态的技术，很妙。需要全部菜单的时候，printMenu() 只需要晚餐的菜单就 printMenu(dinerMenu)
    }

    public static void main(String[] args) {
        testIterator();
    }
}
