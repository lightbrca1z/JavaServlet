import refact.MonthCheck;

//package refact;

public class PracticeJava_Calc_6_1 {

	public static void main(String[] args) {
		int year = 2023; //西暦年
		int month = 1; //月
		int days = 1; //日
		
		days = MonthCheck.chkDays(year, month);
		
		System.out.println("その月の日数は" + days + "です!");
	}

}
