package cn.fancychuan.strategy;

public abstract class Duck {

	FlyBehavior flyBehavior ;  // ����֮���԰�����ָ��Ϊ�ӿڣ�Ŀ����Ϊ������ӿڱ�̣��������п�����ʱ�滻�ɽӿڵ�ʵ���࣬���� FlyWithWings��FlyNoWay
	QuackBehavior quackBehavior ;
	
	public void performFly() {
		flyBehavior.fly() ;  // ί�и���Ϊ��ʵ��fly�Ĺ���
	}
	
	public void performQuack() { // ����� public static void performQuack() ��ô����quackBehavior ��ʱ����Ҫ��static ���� static QuackBehavior quackBehavior ;
		quackBehavior.quack() ;
	}
	
	public void swim() {
		System.out.println("All ducks can swim!");
	}
	
	public void setFlyBehavior(FlyBehavior fb) { // ��������� FlyBehavior���͵�fb��Ҳ����˵�κ�ʵ����FlyBehavior�ӿڵ����ʵ����������Ϊ������������
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
