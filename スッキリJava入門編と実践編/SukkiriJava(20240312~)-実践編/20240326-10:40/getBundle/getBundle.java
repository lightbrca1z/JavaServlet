package getBundle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class getBundle {

	public static void main(String[] args) throws Exception{
		// TODO 自動生成されたメソッド・スタブ
		Locale loc = Locale.getDefault();
		System.out.println(loc.getCountry() + "-" + loc.getLanguage());
		String now = (new SimpleDateFormat()).format(new Date());
		ResourceBundle rb = ResourceBundle.getBundle("getBundle.messages");
		System.out.println(rb.getString("CURRENT_TIME_IS") + now);
	}

}
