
public class PoisonMatango extends Matango10_1 {
	int poisonCount = 5;
	public PoisonMatango(char suffix) {
		super();
	}
	public void attack(Hero10_2 h) {
		super.attack(h);
		if(this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ!");
			this.poisonCount--;
		}
	}
}
