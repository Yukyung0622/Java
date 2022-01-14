package ch13;

import java.util.ArrayList;
import java.util.Iterator;

public class P370 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		for(int i = 0; i<10000000; i++) {
			list.add(i);
		}
		
		//Iterator 실행시간
		long start = System.currentTimeMillis();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			it.next();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Iterator 소요시간 : "+(end-start));
		
		//size 실행시간
		start = System.currentTimeMillis();
		for(int i =0; i<list.size(); i++) {
			list.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("size() 소요시간 : "+(end-start));
	}

}
