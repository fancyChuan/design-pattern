package cn.fancychuan.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack() ; // 抽象超类定义了quackBehavior，是接口类型，这里委托给Quack，Quack是一个实现了特定行为的类
		flyBehavior = new FlyWithWings() ;
	}
	
	public void display() {
		System.out.println("这是一只 MallardDuck 鸭..");
	}
}