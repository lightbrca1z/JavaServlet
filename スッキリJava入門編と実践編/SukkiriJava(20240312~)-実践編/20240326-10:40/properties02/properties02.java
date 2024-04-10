package properties02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class properties02 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Writer fw  = new FileWriter("./20240326-10:40/properties02/rpgdata.properties");
		Properties p = new Properties();
		p.setProperty("heroName", "アサカ");
		p.setProperty("heroHp", "62");
		p.setProperty("heroMp", "45");
		p.store(fw, "勇者の情報");
		fw.close();
	}

}
