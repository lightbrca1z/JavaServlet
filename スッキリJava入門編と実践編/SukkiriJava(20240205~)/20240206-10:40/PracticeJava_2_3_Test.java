
public class PracticeJava_2_3_Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ようこそ占いの舘へ!");
		System.out.println("あなたの名前を入力してください。");
		@SuppressWarnings("resource")
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		@SuppressWarnings("resource")
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("占いの結果が出ました！");
		int FortuneResult = new java.util.Random().nextInt(3)+1;
		System.out.println(age+"歳の"+name+"さん," + "あなたの運気番号は"+FortuneResult+"です！");
		System.out.println("(1:大吉,2:中吉,3:吉,4:凶)");
	}

}
