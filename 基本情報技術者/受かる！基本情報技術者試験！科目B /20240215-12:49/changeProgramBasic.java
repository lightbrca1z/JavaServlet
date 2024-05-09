
public class changeProgramBasic {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        System.out.println("お持ちの金額を入力してください！");
        int HavingMoney = new java.util.Scanner(System.in).nextInt();
        System.out.println("購入されるりんごの数を入力してください！(定額:120円)");
        int BuyingNumber = new java.util.Scanner(System.in).nextInt();
        
        int change = HavingMoney - (120 * BuyingNumber);
        
        System.out.println("お釣り : " + change);
        
        int changeMoney100 = (int)change / 100;
        change = change % 100;
        int changeMoney50 = (int)change / 50;
        change = change % 50;
        int changeMoney10 = (int)change / 10;
        change = change % 10;
        
        System.out.println("100円の枚数 : " + changeMoney100);
        System.out.println("50円の枚数 : " + changeMoney50); 
        System.out.println("10円の枚数 : " + changeMoney10);
	}

}
