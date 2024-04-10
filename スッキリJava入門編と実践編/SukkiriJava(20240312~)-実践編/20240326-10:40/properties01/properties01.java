package properties01;
import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class properties01 {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		Reader fr = new FileReader("./20240326-10:40/properties/rpgdata.properties");
		Properties p = new Properties();
		p.load(fr);
		String name = p.getProperty("heroName");
		String strHp = p.getProperty("heroHp");
		int hp = Integer.parseInt(strHp);
		System.out.println("勇者の名前 : " + name);
		System.out.println("勇者のHP : " + hp);
	}

}
