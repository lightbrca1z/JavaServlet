package commonCsv;

import java.io.FileReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;


public class commonCsv {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		FileReader fr = new FileReader("./20240325-11:54/commonCsv/rpgdata.csv");
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
		for(CSVRecord r : records) {
			String name = r.get(0);
			String hp = r.get(1);
			String mp = r.get(2);
			System.out.println(name + "/" + hp + "/" + mp);
		}
		fr.close();
	}

}
