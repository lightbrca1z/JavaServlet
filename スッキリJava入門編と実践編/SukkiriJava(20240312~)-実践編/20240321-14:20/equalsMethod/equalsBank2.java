package equalsMethod;

public class equalsBank2 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        bank2 myObject1 = new bank2("三井", "住所1");
        bank2 myObject2 = new bank2("三井", "住所1");

        // equalsメソッドを使って等価性を確認する
        boolean isEqual = myObject1.equals(myObject2);
        System.out.println("Objects are equal: " + isEqual);
	}

}
