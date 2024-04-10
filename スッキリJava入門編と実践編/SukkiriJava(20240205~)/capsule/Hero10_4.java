
public class Hero10_4 extends Character{
	public String name = "ミナト";
	int hp = 120;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//　転ぶ
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ!");
		System.out.println("5のダメージ!");
	}
	//　戦う
	public void attack(Matango10_3 m) {
		System.out.println(this.name + "の攻撃!");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}
	//　逃げる
	public void run(Hero10_3 h) {
		System.out.println(h.name + "は、逃げ出した!");
	}
}
