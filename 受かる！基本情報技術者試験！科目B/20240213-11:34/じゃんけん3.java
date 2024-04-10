
public class じゃんけん3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("じゃんけんを入力してください！");
		System.out.println("1:グー,2:チョキ,3:パー");
		int jankenHuman = new java.util.Scanner(System.in).nextInt();
		int jankenCPU = new java.util.Random().nextInt(2) + 1;
		
//		System.out.println(jankenHuman);
//		System.out.println(jankenCPU);
		
		if(jankenHuman == jankenCPU) {
			System.out.println("あいこ");
		}
		else{
			if((jankenHuman == 1 && jankenCPU == 2) || (jankenHuman == 2 && jankenCPU == 2) || (jankenHuman == 3 && jankenCPU == 1))
			{
				System.out.println("人間の勝ち");
			}
			else if (jankenHuman >= 4 || jankenHuman <= 0) {
				System.out.println("正しい数値を入力して下さい！");
			}
			else{
					System.out.println("コンピュータの勝ち");
				}
			}
		}
	}
