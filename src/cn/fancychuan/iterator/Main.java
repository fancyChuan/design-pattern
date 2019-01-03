package cn.fancychuan.iterator;

/**
 * 20190102 迭代器模式
 *
 * 两种方法：
 *      1. 自己实现一个Iterator接口
 *      2. 实现Java自带的 java.util.Iterator 接口
 *      3. 集合框架本身实现了迭代器，直接通过 Iterator() 方法获得迭代器 如 CafeMenu
 *
 * 适用场景：集合类型，需要遍历的时候，将集合（数组、链表、哈希表等）进行封装
 *
 * Collection 和 Iterator 的好处在于：
 *      每个collection都知道如何创建自己的 Iterator。只需要调用下 iterator() 方法，不需要知道实现细节【接口的好处啊】
 */
public class Main {

    public static void testIterator() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu(); // 改不改成Menu接口类型都无所谓
        DinerMenu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu(); // 这里用了多态的技术，很妙。需要全部菜单的时候，printMenu() 只需要晚餐的菜单就 printMenu(dinerMenu)
    }

    public static void main(String[] args) {
        testIterator();
    }
}
