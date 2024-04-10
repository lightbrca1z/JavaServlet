package testChap03;
import java.util.List;

public class test0304 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	List<String> names =
			List.of("湊雄輔", "朝香あゆみ", "菅原拓真", "大江岳人");
	names.stream()
	.filter(n -> n.length() <= 4)
	.map(n -> n + "さん")
	.forEach(System.out::println);
	}
}
