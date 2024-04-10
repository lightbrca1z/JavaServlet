package systemExit;

public class systemExit {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean isErr = true;
		if(isErr) {
			System.out.println("データが壊れています。"
			+ "以上終了します！");
			System.exit(1);
		}
		System.out.println("正常終了しました");
	}

}
