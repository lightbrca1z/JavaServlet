



public class Main4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero2 h = new Hero2();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は, " + h.sword.name);
	}

}
