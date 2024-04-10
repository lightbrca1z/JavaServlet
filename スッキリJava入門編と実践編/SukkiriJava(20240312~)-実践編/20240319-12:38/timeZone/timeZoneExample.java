package timeZone;

import java.util.TimeZone;

public class timeZoneExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TimeZone tz = TimeZone.getDefault();
		System.out.println("現在のタイムゾーン");
		System.out.println(tz.getDisplayName());
		if(tz.useDaylightTime()) {
			System.out.println("夏時間を採用しています。");
		}else {
			System.out.println("夏時間を採用していません。");
		}
		System.out.println("世界標準時との時差は");
		System.out.println(tz.getRawOffset()/360000 + "時間");
	}

}
