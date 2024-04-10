
public class polymorphism2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Character[] c = new Character[3];
		c[0] = new Hero10_4();
		c[0].name = "ミナトA";
		c[0].hp = 120;
		c[1] = new Hero10_4();
		c[1].name = "ミナトB";
		c[1].hp = 140;
		c[2] = new Matango10_3();
		c[2].name = "マタンゴA";
		c[2].hp = 150;
		
		for(Character ch : c) {
			ch.run();
		}
	}

}
