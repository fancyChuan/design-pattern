package cn.fancychuan.adapter;

public class TurkeyAdapter implements Duck {  // 要适配成哪种类型就实现哪种接口，而在实现时方法体内可以做你想做的任何事情。
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i=0; i<5; i++) {
            turkey.fly();
        }
    }
}
