import java.util.ArrayList;
import java.util.List;

class Hero112 {
    public String name;

    public Hero112(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
public class PracticeJavaTest16_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero112 h1 = new Hero112("斉藤");
		Hero112 h2 = new Hero112("鈴木");
		List<Hero112> heros = new ArrayList<Hero112>();
		heros.add(h1);
		heros.add(h2);
		for(Hero112 h : heros) {
			System.out.println(h.getName());
		}
	}

}
