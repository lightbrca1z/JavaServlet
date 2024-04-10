package getProperty2;

public class getProperty2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String ver = System.getProperty("rpg.version");
		String author = System.getProperty("rpg.author");
		System.out.println("RPG: スッキリ魔王征伐　ver" + ver);
		System.out.println("Developed by " + author);
	}

}
