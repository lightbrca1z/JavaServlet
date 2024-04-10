
public class SuperHero extends Hero10_1{
	
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった!");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した!");
	}
	
	public void run() {
		System.out.println(this.name + "は撤退した!");
	}
	
	//オーバーライドできない
//	public void slip() {
//		this.hp -= 5;
//		System.out.println(this.name + "は転んだ!");
//		System.out.println("5のダメージ!");
//	}
	
	public void attack(Matango10_1 m) {
		System.out.println(this.name + "の攻撃!");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
		if(this.flying) {
			System.out.println(this.name + "の攻撃!");
			m.hp -= 5;
			System.out.println("5ポイントのダメージを与えた！");
		}
	}

}
