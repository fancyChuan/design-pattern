package cn.fancychuan.strategy;

public abstract class Duck {

	FlyBehavior flyBehavior ;  // 这里之所以把类型指定为接口，目的是为了面向接口编程，在子类中可以随时替换成接口的实现类，比如 FlyWithWings、FlyNoWay
	QuackBehavior quackBehavior ;
	
	public void performFly() {
		flyBehavior.fly() ;  // 委托给行为类实现fly的功能
	}
	
	public void performQuack() { // 如果用 public static void performQuack() 那么定义quackBehavior 的时候需要用static 即： static QuackBehavior quackBehavior ;
		quackBehavior.quack() ;
	}
	
	public void swim() {
		System.out.println("All ducks can swim!");
	}
	
	public void setFlyBehavior(FlyBehavior fb) { // 这里入参是 FlyBehavior类型的fb，也就是说任何实现了FlyBehavior接口的类的实例都可以作为这个函数的入参
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
