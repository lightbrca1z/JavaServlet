

public class Wizard {
	String name;
	int hp;
	public void heal(Hero2 h) {
		h.hp += 10;
		System.out.println(h.name + "のhpを10回復しました！");
		System.out.println(h.name + "のHP : " + h.hp);
	}

}
