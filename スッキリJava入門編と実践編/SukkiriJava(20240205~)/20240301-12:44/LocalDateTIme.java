import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTIme {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println("現在は" + l1 + "です！");
		LocalDateTime l2 = LocalDateTime.of(2024, 1, 1, 9, 5, 0, 0);
		
		// LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println("現在は" + l3 + "です！");
	}

}
