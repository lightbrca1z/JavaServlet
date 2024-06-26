package quizans1502;
import java.io.*;

public final class MyLogger {
  private static MyLogger theInstance;
  private FileWriter writer;
  private MyLogger() {
    try {
      this.writer = new FileWriter("c:\\dummylog.txt");
    } catch (IOException e) { /* エラー処理は省略 */ }
  }
  public void log(String msg) throws IOException {
  	this.writer.write(msg);
  }
  public static MyLogger getInstance() {
    if (theInstance == null) theInstance = new MyLogger();
    return theInstance;
  }
}
