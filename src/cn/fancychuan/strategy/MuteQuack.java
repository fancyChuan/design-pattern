package cn.fancychuan.strategy;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("<< mute silence >");
	}
}
