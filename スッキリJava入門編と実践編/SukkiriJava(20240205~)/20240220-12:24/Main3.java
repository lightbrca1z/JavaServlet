



public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero2 h1 = new Hero2();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero2 h2 = new Hero2();
		h2.name = "アサカ";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);

	}

}
