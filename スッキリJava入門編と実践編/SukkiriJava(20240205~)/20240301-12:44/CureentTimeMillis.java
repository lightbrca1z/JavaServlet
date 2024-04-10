
public class CureentTimeMillis {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long start = System.currentTimeMillis();
		//ここで何らかの処理をする。
		for(int i = 0; i < 1000000000 ; i++) {
			i = i;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("処理にかかった時間は・・・"
		+ (end -start) + "ミリ秒でした!");
	}

}
