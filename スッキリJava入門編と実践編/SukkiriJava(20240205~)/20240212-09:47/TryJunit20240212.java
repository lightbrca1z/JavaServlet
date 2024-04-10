import org.junit.Test;

public class TryJunit20240212 {

	public static final String STATIC_INIT = "staticイニシャライザ";
	public static int cnt = 0;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(args[0]+ args[1] + "が呼ばれました");
		cnt++;
		System.out.println("カウント=" + cnt);
	}
	static {
		System.out.println(STATIC_INIT + "が呼ばれまいた！");
		cnt++;
		System.out.println("カウント= " + cnt);
	}
	
	void TryJunit(){
		System.out.println("コンストラクタが呼ばれました！");
		cnt++;
		System.out.println("カウント=" + cnt);
	}
	
	public int sub() {
		System.out.println("subメソッドが呼ばれました！");
		cnt++;
		System.out.println("カウント=" + cnt);
		return cnt;
	}
	
	@Test
	public void testTryJunit() {
		System.out.println("Test1です！");
		
//		assertEquals(1,TryJunit.cnt);
	}
	
	@Test
	public void testMain()
	{
		System.out.println("Test2です！");
		
		String[] str = {"main","メソッド"};
		TryJunit.main(str);
		
		TryJunit tj = new TryJunit();
//		assertEquals(4, tj.sub());
	}

}
