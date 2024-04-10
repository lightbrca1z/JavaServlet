
public class SuperHeroRun {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Matango10_1 m1 = new Matango10_1();
		m1.hp = 50;
		m1.suffix = 'A';
		
		System.out.println("HP : " + m1.hp);
		SuperHero sh = new SuperHero();
		sh.attack(m1);
		System.out.println("HP : " + m1.hp);
	}

}
