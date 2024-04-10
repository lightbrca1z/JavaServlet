package fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
//		FileReader fw = new FileReader("/Applications/Eclipse_2023-12.app/Contents/workspace/SukkiriJava(20240312~)-実践編/20240322-12:09/fileReader/testFile01.txt");
		FileReader fw = new FileReader("./20240322-12:09/fileReader/testFile01.txt");
		System.out.println("すべてのデータを読んで表示します");
		int i = fw.read();
		while(i != -1) {
			char c = (char)i;
			System.out.println(c);
			i = fw.read();
		}
		System.out.println("ファイルの末尾に到達しました!");
		fw.close();
//	    String currentDirectory = System.getProperty("user.dir");
//      System.out.println("カレントディレクトリ: " + currentDirectory);

	}

}
