package cn.fancychuan.adapter;

public class TurkeyAdapter implements Duck {  // 要适配哪种类型就实现哪种接口
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
