
public class Character {
	public String name = "キャラクター1";
	int hp = 100;
	//　逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した!");
	}
	public void attack(Matango10_3 m) {
		System.out.println(this.name + "の攻撃!");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}
}
