
public class 余りを使ったじゃんけん2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 0;
		while(i<10) {
			System.out.println("じゃんけんを入力してください！");
			System.out.println("1:グー,2:チョキ,3:パー,4:OK");
			int jankenHuman = new java.util.Scanner(System.in).nextInt();
			int jankenCPU = new java.util.Random().nextInt(3) + 1;
			int variable = 0;
			
	//		System.out.println(jankenHuman);
	//		System.out.println(jankenCPU);
			
			if(jankenHuman == jankenCPU) {
				System.out.println("あいこ");
			}
			else if (jankenHuman == 4){
				System.out.println("人間の勝ち");
			}
			else if (jankenCPU == 4){
				System.out.println("コンピュータの勝ち");
			}
			else if(jankenCPU != 4){
				variable = jankenHuman + 1;
				if(variable > 3) {
					variable = 1;
				}
				if(variable == jankenCPU) {
					System.out.println("人間の勝ち");
				}else {
					System.out.println("コンピュータの勝ち");
				}
			}
			else if (jankenHuman >= 4 || jankenHuman <= -1) {
				System.out.println("正しい数値を入力して下さい！");
			}
			else{
						System.out.println("コンピュータの勝ち");
			}
			}
		}
	}

