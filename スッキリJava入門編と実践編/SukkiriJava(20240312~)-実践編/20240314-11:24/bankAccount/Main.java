package bankAccount;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Account a1 = new Account("13234422", "普通");
		System.out.println("口座番号は" + a1.getAccountNo());
		System.out.println("口座種別は" + a1.getAccountType());
	}

}
