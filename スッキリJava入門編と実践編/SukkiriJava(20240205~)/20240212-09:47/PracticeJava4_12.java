
public class PracticeJava4_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] seq = new int[10];
		
		//塩基配列をランダムに生成
		for(int i = 0;i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		for(int i = 0;i < seq.length; i++) {
		char[] base = {'A','T','G','C'};
		System.out.print(base[seq[i]] + " ");
		}
	}

}
