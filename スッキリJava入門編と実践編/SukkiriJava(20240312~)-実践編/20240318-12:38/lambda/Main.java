package lambda;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Function<String, Integer> func =
				(String s) -> {return s.length();};
		int n = func.apply("Java");
		System.out.println("文字列「Java」は、" + n + "文字です");
	}

}
