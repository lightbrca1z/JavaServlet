import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDateConvert {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		SimpleDateFormat f =
				new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//文字列からDateインスタンスを生成
		Date d = f.parse("2023/09/18 05:53:20");
		String s2 = f.format(d);
		System.out.println(d);
		System.out.println("現在は" + s2 + "です！");
		//Dateインスタンスから文字列を生成
		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s + "です！");
	}

}
