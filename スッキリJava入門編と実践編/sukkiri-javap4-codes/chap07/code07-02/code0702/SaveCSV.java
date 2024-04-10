package code0702;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class SaveCSV {
  public void saveHeroToFile(Hero h) throws IOException {
    Writer bw = new BufferedWriter(new FileWriter("rpgsave.dat"));
    /* コード7-2ここから */
    bw.write(h.name);
    bw.write(",");
    bw.write(h.hp);
    bw.write(",");
    bw.write(h.mp);
    /* コード7-2ここまで */
    bw.flush();
    bw.close();
  }
}
