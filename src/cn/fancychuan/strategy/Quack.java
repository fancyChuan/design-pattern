package cn.fancychuan.strategy;

public class Quack implements QuackBehavior {

	public void quack() { // 实现接口的方法
		System.out.println("Quack~~ ");
	}
}