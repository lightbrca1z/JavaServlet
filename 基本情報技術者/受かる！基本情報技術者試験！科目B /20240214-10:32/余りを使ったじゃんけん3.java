
public class 余りを使ったじゃんけん3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] daysArray = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("月を入力してください！");
        int inputMonth = new java.util.Scanner(System.in).nextInt();
        System.out.println("日数を入力してください！");
        int inputMonthDay = new java.util.Scanner(System.in).nextInt();
        int AccountMonthAndDay = 0;
        AccountMonthAndDay = AccountMonthAndDay + inputMonthDay;
        
        for(int CalcMonth = 0;CalcMonth < (inputMonth - 1);CalcMonth++) {
        	System.out.println("月別の日数: " + daysArray[CalcMonth]);
        	AccountMonthAndDay = AccountMonthAndDay + daysArray[CalcMonth];
        }
        
        System.out.println("通算日数: " + AccountMonthAndDay);
	}
}

