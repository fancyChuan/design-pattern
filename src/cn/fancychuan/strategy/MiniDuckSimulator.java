package cn.fancychuan.strategy;

public class MiniDuckSimulator {
	
	public void baseDuck() {
		Duck mallard = new MallardDuck(); // ����Ϊ���࣬Ҳ�����������̡���Գ�����
		mallard.swim();
		
		mallard.performFly();
		mallard.performQuack();
	}

	public static void main(String[] args) {
		Duck model = new  ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		// model.display(); // TODO: ���ﲻ�ܵ��þ�����ĺ�������Ϊָ����������Duck���࣬��Ҫ��ô���ܵ����Լ���display ?
	}
}
