package StringReader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class StringReaderPg {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
        String msg = "第1土曜日は資源ゴミの回収です";
        Reader sr = new StringReader(msg);
        System.out.println((char) sr.read());
        System.out.println((char) sr.read());
	}

}
