package code0712;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import code0713.Hero;

public class Hero {
    String name;
    int hp;
    int mp;

    Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    /* コード7-12ここから */
    public Hero loadHeroFromFile() throws IOException {
      BufferedReader br = new BufferedReader(new FileReader("rpgsave.dat"));
      String name = br.readLine();    // 改行まで名前として読む
      String hp = br.readLine();      // 改行までHPとして読む
      String mp = br.readLine();      // 改行までMPとして読む
      br.close();
      return new Hero(name, Integer.parseInt(hp), Integer.parseInt(mp));
    }
    /* コード7-12ここまで */
}
