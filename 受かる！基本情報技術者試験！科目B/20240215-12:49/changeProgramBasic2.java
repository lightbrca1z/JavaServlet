
public class changeProgramBasic2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        System.out.println("お持ちの金額を入力してください！");
        int HavingMoney = new java.util.Scanner(System.in).nextInt();
        System.out.println("購入されるりんごの数を入力してください！(定額:120円)");
        int BuyingNumber = new java.util.Scanner(System.in).nextInt();
        
        //お釣り初期
        int change = HavingMoney - (120 * BuyingNumber);
        
        //コインの種類
        int[] coin = {10,50,100,500};
        //お釣りの結果
        int[] countCoin = new int[4];
        
        System.out.println("お釣り : " + change);
        
        //カウンター数
        int countNumber = 3;
        while(countNumber >= 0 && change >= 0) {
        	//コインの枚数計算
        	countCoin[countNumber] = (int)change / coin[countNumber];
        	//お釣り
        	change = change % coin[countNumber];
        	//カウントアップ
        	countNumber = countNumber - 1;
        }
        
        for(int i = countCoin.length - 1; i >= 0; i--) {
        	//硬貨の枚数
            System.out.println(coin[i]+"円の枚数 : " + countCoin[i]);
        }
      
        
	}

}
