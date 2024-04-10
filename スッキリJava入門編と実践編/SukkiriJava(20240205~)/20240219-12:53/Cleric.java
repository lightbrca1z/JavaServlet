import java.util.Random;

public class Cleric {
	String name;
	int HP;
	int maxHP = 100;
	int MP;
	int maxMP = 100;;
	
	public void selfAid() {
		this.MP -= 5;
		this.HP = maxHP;
		System.out.println(this.name + "は、HPを最大回復した！");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は、" + sec + "秒間天に祈った");
		
		int recover = new Random().nextInt(3) + sec;
		
		int recoverActual = Math.min(this.maxMP - this.MP, recover);
		
		this.MP += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	} 
	
}
