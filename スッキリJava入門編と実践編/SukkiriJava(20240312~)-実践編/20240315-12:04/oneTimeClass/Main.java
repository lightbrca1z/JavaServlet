package oneTimeClass;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pocket<Object> pocket = new Pocket<>();
		System.out.println("使い捨てのインスタンス");
		pocket.put(new Object() {
			String innerField;
		void innerMethod() {/**/}
		});
	}

}
