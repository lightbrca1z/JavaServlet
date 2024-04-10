package equalsMethod;

public class equalsBank {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        bank myObject1 = new bank("三井", "住所1");
        bank myObject2 = new bank("三井", "住所1");

        // equalsメソッドを使って等価性を確認する
        boolean isEqual = myObject1.equals(myObject2);
        System.out.println("Objects are equal: " + isEqual);
	}

}
