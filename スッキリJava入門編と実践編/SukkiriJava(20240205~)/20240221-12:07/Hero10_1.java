
public class Hero10_1 {
	String name = "ミナト";
	int hp = 100;
	//　転ぶ
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ!");
		System.out.println("5のダメージ!");
	}
	//　戦う
	public void attack(Matango10_1 m) {
		System.out.println(this.name + "の攻撃!");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}
	//　逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した!");
	}
}
