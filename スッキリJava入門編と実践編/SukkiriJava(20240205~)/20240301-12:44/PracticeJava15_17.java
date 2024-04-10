import java.time.LocalDate;
import java.time.Period;

public class PracticeJava15_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LocalDate d1 = LocalDate.of(2023, 1, 1);
		LocalDate d2 = LocalDate.of(2023, 1, 4);
		
		//3日間を表すperiodを2通りの方法で生成
		Period p1 = Period.ofDays(3);
		System.out.println("現在は" + p1 + "です！");
		Period p2 = Period.between(d1, d2);
		System.out.println("現在は" + p2 + "です！");
		
        //d2のさらに3日後を計算する　p1をLocalDateを使って、日付型に変換出来る。
        LocalDate d3 = d2.plus(p1); // p1 を加算することで、d2 の日付に 3 日を加える
        System.out.println("現在は" + d3 + "です！");
		
		//d2のさらに3日後を計算する
		LocalDate d4 = d2.plus(p2);
		
		System.out.println("現在は" + d4 + "です！");

	}

}
