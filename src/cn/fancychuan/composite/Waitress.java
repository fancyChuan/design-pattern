package cn.fancychuan.composite;

import cn.fancychuan.iterator.Menu;
import cn.fancychuan.iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    MenuComponent menus;

    public Waitress(MenuComponent menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.print();
    }
}
