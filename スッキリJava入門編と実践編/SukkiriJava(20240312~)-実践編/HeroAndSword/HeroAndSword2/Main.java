package HeroAndSword2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero("たてあつ");
		Sword s = new Sword("強靭な金槌");
		
		h1.setSword(s);
		System.out.println("装備：" + h1.getSword().getName());
		System.out.println("clone()で複製します");
		Hero h2 = h1.clone();
		
		System.out.println("コピー元の勇者の剣の名前を変えます!");
		h1.getSword().setName("強靭な剣");
		System.out.println("コピー元とコピー先の勇者の装備を表示します！");
		System.out.println("コピー元:" + h1.getSword().getName() + "/コピー先:" + h2.getSword().getName());
	}

}
