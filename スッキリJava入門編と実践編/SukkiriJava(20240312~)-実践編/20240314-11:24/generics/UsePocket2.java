package generics;

public class UsePocket2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pocket2<String> p = new Pocket2();
		p.put("11923");
		String s = (String)p.get();
		System.out.println(s);
	}

}
