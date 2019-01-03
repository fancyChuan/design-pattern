package cn.fancychuan.composite;

import cn.fancychuan.iterator.Menu;
import cn.fancychuan.iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress2 {
    ArrayList menus;

    public Waitress2(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next(); // 集合类，在取出里面的元素的，都需要价格显式的类型转化
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator iterator) {
        System.out.println("Menu:");
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
