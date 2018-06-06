class Animal{
	private void beat(){
		System.out.println("心脏跳动……");

	}

	public void breath(){
		beat();
		System.out.println("吸一口气，吐一口气，呼吸中……");
	}
}

//继承Animal，直接复用父类的breath()方法
class Brid extends Animal{
	public void fly(){
		System.out.println("我在天空中自在地飞翔……");
	}
}

//继承Animal，直接复用父类的breath()方法
class Wolf extends Animal{
	public void run(){
		System.out.println("我在陆地上快速地奔跑……");
	}
}

public class InheritTest{
	public static void main( String[] agts ){
		Brid brid = new Brid();
		brid.breath();
		brid.fly();

		Wolf wolf = new Wolf();
		wolf.breath();
		wolf.run();
	}
}