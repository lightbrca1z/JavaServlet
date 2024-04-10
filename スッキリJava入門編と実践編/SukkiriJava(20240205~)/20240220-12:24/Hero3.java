

public class Hero3 {
	String name;
	int hp;
	
	Sword sword;
	
	public Hero3(String name) {
		this.hp = 100;
		this.name = name;
	}
	
	//オーバーロード
	public Hero3() {
		this.hp = 100;
		this.name = "ダミー";
	}

}
