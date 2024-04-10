package bufferedWrite;

import java.io.IOException;

public class HeroCallAndSave {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		Save s = new Save();
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 75;
		h.mp = 18;
		s.saveHeroToFile(h);
	}

}
