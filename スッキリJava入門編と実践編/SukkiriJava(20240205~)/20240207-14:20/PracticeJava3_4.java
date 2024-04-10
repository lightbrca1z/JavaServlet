
public class PracticeJava3_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの運勢を占います。");
		int fortune = new java.util.Random().nextInt(4) + 1;
		if (fortune == 1) {
			System.out.println("大吉");
		}
		else if (fortune == 2) {
			System.out.println("中吉");
		}
		if (fortune == 3) {
			System.out.println("吉");
		}
		if (fortune == 4) {
			System.out.println("凶");
		}
	}

}
