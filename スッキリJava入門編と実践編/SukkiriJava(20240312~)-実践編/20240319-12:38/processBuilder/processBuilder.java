package processBuilder;

import java.io.File;
import java.io.IOException;

public class processBuilder {

    public static void main(String[] args) {
        System.out.println("Sublime Textを開始します");
        
        // Sublime Textのパスを指定
        String sublimeTextPath = "/Applications/Sublime Text.app/Contents/SharedSupport/bin/subl";

        // ProcessBuilderを作成し、Sublime Textを起動するコマンドを設定
        ProcessBuilder pb = new ProcessBuilder(sublimeTextPath);

        try {
            // ディレクトリを設定する（Sublime Textを起動する際、このディレクトリがカレントディレクトリとなる）
            pb.directory(new File("/")); // 任意のディレクトリを指定してください

            // プロセスを開始
            pb.start();
            
            System.out.println("Sublime Textの起動が完了しました");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
