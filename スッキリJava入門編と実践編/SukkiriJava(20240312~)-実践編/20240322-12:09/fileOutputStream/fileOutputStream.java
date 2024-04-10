package fileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		FileOutputStream fos = new FileOutputStream("./20240322-12:09/fileOutputStream/rpgsave.dat", true);
		fos.write(65);
		fos.flush();
		fos.close();
		System.out.println("作成完了！");
	}

}
