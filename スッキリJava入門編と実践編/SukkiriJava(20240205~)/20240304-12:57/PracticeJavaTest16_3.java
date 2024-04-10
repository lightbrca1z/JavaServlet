import java.util.HashMap;
import java.util.Map;

class Hero113 {
    public String name;

    public Hero113(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
public class PracticeJavaTest16_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero113 h1 = new Hero113("斉藤");
		Hero113 h2 = new Hero113("鈴木");
		Map<Hero113, Integer> heroes = new HashMap<Hero113, Integer>();
		heroes.put(h1, 3);
		heroes.put(h2, 7);
		for(Hero113 key: heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName()+"が倒した敵＝"+value);
		}
	}

}
