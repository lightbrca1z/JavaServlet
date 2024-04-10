
public class PracticeJava4_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {0,20,30,40,50,80};
		int sum =  scores[1] + scores[2]+ scores[3]+ scores[4]+ scores[5];
		int avg = sum / scores.length;
		System.out.println("合計店: " + sum);
		System.out.println("平均点: " + avg);
	}

}
