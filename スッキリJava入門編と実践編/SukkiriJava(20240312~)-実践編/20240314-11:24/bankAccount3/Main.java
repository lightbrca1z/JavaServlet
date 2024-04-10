package bankAccount3;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Account a1 = new Account("13234422", AccountType.FUTSU);
		System.out.println("口座番号は" + a1.getAccountNo());
		System.out.println("口座種別は" + a1.getAccountType());

		Account a2 = new Account("22443322", AccountType.TEIKI);
		System.out.println("口座番号は" + a2.getAccountNo());
		System.out.println("口座種別は" + a2.getAccountType());

		Account a3 = new Account("33224433", AccountType.TOUZA);
		System.out.println("口座番号は" + a3.getAccountNo());
		System.out.println("口座種別は" + a3.getAccountType());
	}

}
