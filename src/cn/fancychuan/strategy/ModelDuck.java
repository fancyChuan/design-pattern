package cn.fancychuan.strategy;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	public void display() {
		System.out.println("这是一只 model 鸭..");
	}
}
