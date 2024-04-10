


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero2 h = new Hero2();
		h.name = "ミナト";
		h.hp = 100;
		
		Matango2 m1 = new Matango2();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango2 m2 = new Matango2();
		m2.hp = 48;
		m2.suffix = 'B';
		
		//冒険のはじまり
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}

}
