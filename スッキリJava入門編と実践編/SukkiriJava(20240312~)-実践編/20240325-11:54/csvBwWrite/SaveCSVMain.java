package csvBwWrite;

import java.io.IOException;

public class SaveCSVMain {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		SaveCSV sc = new SaveCSV();
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = "75";
		h.mp = "18";
		sc.saveHeroToFile(h);
	}

}
