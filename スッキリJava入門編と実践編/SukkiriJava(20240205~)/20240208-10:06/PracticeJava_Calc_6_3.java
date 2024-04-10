import refact.MonthCheck;
import refact.MonthCheck2;

//package refact;

public class PracticeJava_Calc_6_3 extends MonthCheck2 {

	public static void main(String[] args) {
		int year = 2023; //西暦年
		int month = 1; //月
		int days = 1; //日
		int number = 3;
		
		days = MonthCheck.chkDays(year, month);
		
		System.out.println("その月の日数は" + days + "です!");
	}

}
