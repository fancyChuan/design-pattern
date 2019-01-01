package cn.fancychuan.iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 5;
    int numberOfItems = 0;
    MenuItem[] menuItems; // 用一个MenuItem类型的数组来存放每个MenuItem

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("a", "这是A", true, 12.25);
        addItem("b", "这是b", false, 13.25);
        addItem("c", "这是c", true, 14.25);
        addItem("d", "这是d", false, 15.25);
        addItem("e", "这是e", true, 14.25);
        addItem("f", "这是f", false, 15.25);
    }



    public void addItem(String name, String description, boolean vegatarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegatarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("[#]太多菜单啦");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }

    }
}
