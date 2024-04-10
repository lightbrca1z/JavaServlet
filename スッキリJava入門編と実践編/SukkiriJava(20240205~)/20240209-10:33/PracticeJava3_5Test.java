
public class PracticeJava3_5Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("[メニュー]1:検索 2:登録 3:削除 4:変更");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected) {
		case 1 -> {
			System.out.println("検索します");
		}
		case 2 -> {
			System.out.println("登録します");
		}
		case 3 -> {
			System.out.println("削除します");
		}
		case 4 -> {
			System.out.println("変更します");
		}
		}
	}

}
