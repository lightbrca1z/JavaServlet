
public class PracticeJavaEclipse6_21 {

	private static final double _0_1 = 0.1;
	private static int postTax;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int uriage = 1000;
		
		calcTax(uriage);
		calcTax(1000);
	}

	public static void calcTax(int price) {
		double taxRate = 0.1;
		
		//税込み金額を計算する。
		postTax = (int)(price * (1 + taxRate));
		
		//税込み金額を出力する。
		System.out.println("税込み金額は, " + postTax + "円です！");
	}

}
