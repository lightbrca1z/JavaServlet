package csvBwWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class SaveCSV {
	public void saveHeroToFile(Hero h) throws IOException{
		Writer bw = new BufferedWriter(new FileWriter("./20240325-11:54/csvBwWrite/rpgsave.dat"));
		bw.write(h.name);
		bw.write(",");
		bw.write(h.hp);
		bw.write(",");
		bw.write(h.mp);
		
		bw.flush();
		bw.close();
	}
}
