
public class PracticeJavaEclipse6_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int uriage = 1000;
		
		int zeikomi = (int)calcTax(uriage);
		System.out.println("税込金額は、" + zeikomi + "円です！");
		
		uriage = uriage * 20;
		zeikomi = (int)calcTax(uriage);
		System.out.println("税込金額は、" + calcTax(uriage) + "円です！");
	}

	private static double calcTax(int uriage) {
		return uriage*(1+0.1);
	}

}
