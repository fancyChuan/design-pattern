package cn.fancychuan.iterator;

import java.util.ArrayList;
import java.util.Iterator;

//public class PancakeHouseMenu{
public class PancakeHouseMenu implements Menu { // 优化的地方，让Waitress能够统一管理菜单
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("A", "这是A", true, 12.25);
        addItem("B", "这是B", false, 13.25);
        addItem("C", "这是C", true, 14.25);
        addItem("D", "这是D", false, 15.25);
    }

    public void addItem(String name, String description, boolean vegatarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegatarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
