



public class Main7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero3 h = new Hero3("ミナト");
		
		Thief t1 = new Thief("アサカ", 40, 5);
		Thief t2 = new Thief("アサカ", 35);
		Thief t3 = new Thief("アサカ");
//		Thief t4 = new Thief();
		
		System.out.println(t1.name + " " + t1.hp + " " +t1.mp);
		System.out.println(t2.name + " " + t2.hp);
		System.out.println(t3.name);
//		System.out.println(t4);
	}

}
