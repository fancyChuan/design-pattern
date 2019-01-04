package cn.fancychuan.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) { // 体现：针对抽象类MenuComponent编程，而非具体实现MenuItem、Menu编程
        // 这个地方抽象类，或者说结口的作用就又显现出来了，对于同一个集合ArrayList，元素都应该是同一种类型，但是Menu和MenuItem是两个类
        // 只有当他们都继承同一个父类时，并向上转型为父类，这样就具有相同特征了
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n[*]" + getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
