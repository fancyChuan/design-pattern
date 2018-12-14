package cn.fancychuan.strategy;

public class MiniDuckSimulator {
	
	public void baseDuck() {
		Duck mallard = new MallardDuck(); // 定义为超类，也就是面向超类编程、针对超类编程
		mallard.swim();
		
		mallard.performFly();
		mallard.performQuack();
	}

	public static void main(String[] args) {
		Duck model = new  ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		// model.display(); // TODO: 这里不能调用具体类的函数，因为指定的类型是Duck超类，那要怎么才能调用自己的display ?
	}
}
