package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FileWriter fw = null;
		try {
			fw = new FileWriter("./20240322-12:09/fileWriter/rpgsave.dat");
			fw.write("AAA");
			fw.flush();
		}catch(IOException e) {
			System.out.println("ファイル書き込みエラーです。");
		}finally {
			if(fw != null) {
				try {
					fw.close();
				}catch(IOException e2) {}
			}
		}
	}

}
