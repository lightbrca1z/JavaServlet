
public class Matango10_3 extends Character{
private static final char A = 0;
int hp = 100;
final int LEVEL = 10;
char suffix = A;
public String name = "マタンゴ";
 public void run(Matango10_3 m) {
	 System.out.println(
			 m.name + this.suffix + "は逃げ出した");
 }
public void attack(Hero10_4 h) {
	// TODO 自動生成されたメソッド・スタブ
	System.out.println(h.name + "の攻撃!");
	h.hp -= 5;
	System.out.println("5ポイントのダメージを与えた");
}
}
