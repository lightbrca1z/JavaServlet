package bufferedWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Save {
	public void saveHeroToFile(Hero h) throws IOException{
		Writer w = new BufferedWriter(new FileWriter("./20240325-11:54/bufferedWrite/rpgsave.dat"));
		w.write(h.name + "\n");
		w.write(h.hp + "\n");
		w.write(h.mp + "\n");
		w.flush();
		w.close();
	}
}
