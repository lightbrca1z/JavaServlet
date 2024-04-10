
public class PracticeJavaEclipse6_18 {

	private static final double _0_1 = 0.1;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int uriage = 1000;
		double tax = _0_1;
		
		int zeikomi = (int)calcTax(uriage,tax);
		System.out.println("税込金額は、" + zeikomi + "円です！");
		
		uriage = uriage * 20;
		zeikomi = (int)calcTax(uriage,tax);
		System.out.println("税込金額は、" + zeikomi + "円です！");
	}

	private static double calcTax(int uriage,double tax) {
		return uriage*(1+0.1);
	}
}
