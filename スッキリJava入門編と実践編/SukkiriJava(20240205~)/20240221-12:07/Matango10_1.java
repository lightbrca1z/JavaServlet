
public class Matango10_1 {
private static final char A = 0;
int hp = 100;
final int LEVEL = 10;
char suffix = A;
private String name;
 public void run() {
	 System.out.println(
			 "お化けキノコ" + this.suffix + "は逃げ出した");
 }
public void attack(Hero10_2 h) {
	// TODO 自動生成されたメソッド・スタブ
	System.out.println(h.name + "の攻撃!");
	h.hp -= 5;
	System.out.println("5ポイントのダメージを与えた");
}
}
