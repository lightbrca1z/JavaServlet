package code0701;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Save {
  /* コード7-1ここから */
  public void saveHeroToFile(Hero h) throws IOException {
    Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
    w.write(h.name + "\n");  // 名前の末尾に改行を付けて保存
    w.write(h.hp + "\n");    // HPの末尾に改行を付けて保存
    w.write(h.mp + "\n");    // MPの末尾に改行を付けて保存
    w.flush();
    w.close();
  }
  /* コード7-1ここまで */
}
