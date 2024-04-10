package tryWithResource;

import java.io.FileWriter;
import java.io.IOException;

public class tryWithResource {

	public static void main(String[] args) throws IOException {
		try (
			FileWriter fw = new FileWriter("./20240322-12:09/tryWithResource/rpgsave1.dat", true);		
		){
			fw.write('A');
			fw.flush();
		}catch(IOException e) {
			System.out.println("ファイル書き込みエラーです。");
		}
	}

}
