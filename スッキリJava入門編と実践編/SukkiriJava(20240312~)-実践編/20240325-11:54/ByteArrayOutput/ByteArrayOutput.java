package ByteArrayOutput;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutput {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(65);
		baos.write(66);
		byte[] data = baos.toByteArray();
		for(byte b : data) {
			System.out.println(b);
		}
	}

}
