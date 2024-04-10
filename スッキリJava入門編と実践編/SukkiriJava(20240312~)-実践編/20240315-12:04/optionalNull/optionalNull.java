package optionalNull;

import java.util.Optional;

public class optionalNull {
	public static Optional<String> decorate(String s, char c){
		String r;
		if(s == null || s.length() == 0) {
			r = null;
		}else {
			r= c+ s+ c;
		}
		return Optional.ofNullable(r);
	}
	
	public static void main(String[] args) {
		Optional<String> s = decorate("",'*');
		System.out.println(s.orElse("nullのため処理出来ません!"));
		Optional<String> s1 = decorate("111",'*');
		System.out.println(s1.orElse("nullのため処理出来ません!"));
	}
	
}
