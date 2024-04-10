package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Account> list = new ArrayList<>();
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		a1.number = 4000;
		a2.number = 2000;
		a3.number = 30000;
		a1.zandaka = 500000;
		a2.zandaka = 200000;
		a3.zandaka = 100000;
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		System.out.println("ソート前:");
		for(Account a: list) {
			System.out.println(a.number);
		}
		
		Collections.sort(list);
		
		System.out.println("自然順序でのソート後:");
		for(Account a: list) {
			System.out.println(a.number);
		}
		
		Collections.sort(list, new ZandakaComparator());
		
		System.out.println("残高順でソート後:");
		for(Account a: list) {
			System.out.println(a.number);
		}
	}

}
