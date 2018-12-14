package cn.fancychuan.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack() ; // �����ඨ����quackBehavior���ǽӿ����ͣ�����ί�и�Quack��Quack��һ��ʵ�����ض���Ϊ����
		flyBehavior = new FlyWithWings() ;
	}
	
	public void display() {
		System.out.println("����һֻ MallardDuck Ѽ..");
	}
}
