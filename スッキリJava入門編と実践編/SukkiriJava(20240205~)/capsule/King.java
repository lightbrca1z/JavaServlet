
public class King {
	void talk(Hero10_4 h1) {
		System.out.println("ようこそ我が国へ、勇者" + h1.getName() + "よ。");
	}
	
	public static void main(String[] args) {
		King k = new King();
		Hero10_4 h1 = new Hero10_4();
//		h1.name = "キャラ1";
		h1.setName("キャラB");
		k.talk(h1);
	}

}
