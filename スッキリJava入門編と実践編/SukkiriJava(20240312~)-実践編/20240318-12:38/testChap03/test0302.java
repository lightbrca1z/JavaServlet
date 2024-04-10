package testChap03;

public class test0302 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Func1 f1 = x -> x % 2 == 1;
		Func2 f2 = (point, name) -> {
			return name + "さんは" + (point > 65 ? "合格" : "不合格");
		};
		System.out.println(f1.call(15));
		System.out.println(f2.call(66, "Smith"));
	}

}
