package refact;

public class MonthCheck {
	public static int chkDays(int year, int month) {
		int days = 31;
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			days = 31;
		}else if (month == 2) {
			days = leapYear(year);
		}else if (month == 4 ||month == 6 ||month == 9 ||month == 11) {
			days = 30;
		}else {
			System.out.println("該当する年月がありません！");
		}
		return days;
	}

	private static int leapYear(int year) {
		int days;
		if((year % 4) == 0 && (year % 100 != 0 || year % 400 == 0)) {
			days = 29;
		}else {
			days = 28;
		}
		return days;
	}
	
	public static int number(int number) {
		return number;
	}
	
	public static String nullValue() {
		String s = null;
		return s;
	}
	
	public static boolean trueValue() {
		int x = 10;
		
		if(x == 10) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean falseValue() {
		int x = 0;
		
		if (x == 10) {
			return true;
		}else {
			return false;
		}
	}
}
