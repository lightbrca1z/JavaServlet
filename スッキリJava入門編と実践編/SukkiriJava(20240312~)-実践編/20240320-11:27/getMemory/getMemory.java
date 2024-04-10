package getMemory;

public class getMemory {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long f = Runtime.getRuntime().freeMemory() /1024/1024;
		System.out.println(f+"MB");
	}

}
