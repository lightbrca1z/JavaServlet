import java.util.ArrayList;
import java.util.List;

class Hero111{
	public String name;
}

public class PracticeJava16_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero111 h = new Hero111();
		h.name = "ミナト";
		List<Hero111> list = new ArrayList<Hero111>();
		list.add(h);
		h.name = "スガワラ";
		System.out.println(list.get(0).name);
	}

}
