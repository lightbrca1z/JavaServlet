
public class PracticeJava2_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの名前を入力してください。");
		@SuppressWarnings("resource")
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		@SuppressWarnings("resource")
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、"+age+"歳の"+name+"さん");
	}

}
