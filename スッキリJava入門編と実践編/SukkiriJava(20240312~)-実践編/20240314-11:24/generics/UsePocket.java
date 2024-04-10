package generics;

public class UsePocket {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pocket p = new Pocket();
		p.put("1192");
		String s = (String)p.get();
		System.out.println(s);
	}

}
