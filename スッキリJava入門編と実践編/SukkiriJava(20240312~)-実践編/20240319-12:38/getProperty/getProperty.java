package getProperty;

import java.util.Iterator;
import java.util.Properties;


public class getProperty {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("利用中のjavaバージョン");
		System.out.println(System.getProperty("java.version"));
		
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		
		System.out.println("システムプロパティ一覧");
		while(i.hasNext()) {
			String key = i.next();
			System.out.println(key + " = ");
			System.out.println(System.getProperty(key));
		}
	}
}
