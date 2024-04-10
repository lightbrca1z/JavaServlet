
public class PracticeJavaEclipse6_24 {

	private static final class French {
		@Override
		public String toString() {
			String french = "Bonjour le monde!";
			return french;
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		transWord(new French());
	}
	
	public static void transWord(Object obj) {
		System.out.println(obj.toString());
	}

}
