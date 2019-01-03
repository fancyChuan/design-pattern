package cn.fancychuan.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("咖啡A", "这是咖啡A", true, 12.25);
        addItem("咖啡B", "这是咖啡B", false, 13.25);
        addItem("咖啡C", "这是咖啡C", true, 14.25);
        addItem("咖啡D", "这是咖啡D", false, 15.25);
    }

    public void addItem(String name, String description, boolean vegatarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegatarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator(); // 支持迭代器，只需要取出值的部分
    }
}
