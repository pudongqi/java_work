class Animal{
	private void beat(){
		System.out.println("心脏跳动……");

	}

	public void breath(){
		beat();
		System.out.println("吸一口气，吐一口气，呼吸中……");
	}
}

class Brid{
	//将原来的父类组合到原来的子类，作为子类的一个组合部分
	private Animal animal;

	public Brid( Animal animal){
		this.animal = animal;
	}

	//重新定义自己的breath()方法
	public void breath(){
		//直接复用Animal提供的breath()方法来实现Brid的breath()方法
		animal.breath();
	}

	public void fly(){
		System.out.println("我在天空中自在地飞翔……");
	}
}


class Wolf{
	//将原来的父类组合到原来的子类，作为子类的一个组合部分
	private Animal animal;

	public Wolf( Animal animal ){
		this.animal = animal;
	}

	//重新定义自己的breath()方法
	public void breath(){
		//直接复用Animal提供的breath()方法来实现Brid的breath()方法
		animal.breath();
	}

	public void run(){
		System.out.println("我在陆地上快速地奔跑……");
	}
}

public class CompositeTest{
	public static void main( String[] agts ){

		Animal animal1 = new Animal();

		Brid brid = new Brid( animal1 );
		brid.breath();
		brid.fly();

		Animal animal2 = new Animal();
		Wolf wolf = new Wolf(animal2);
		wolf.breath();
		wolf.run();
	}
}