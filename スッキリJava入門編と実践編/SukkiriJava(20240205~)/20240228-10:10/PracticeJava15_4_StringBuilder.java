
public class PracticeJava15_4_StringBuilder {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		
		System.out.println(s);
	}

}
