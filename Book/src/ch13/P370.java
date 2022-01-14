package ch13;

import java.util.ArrayList;
import java.util.Iterator;

public class P370 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		for(int i = 0; i<10000000; i++) {
			list.add(i);
		}
		
		//Iterator ����ð�
		long start = System.currentTimeMillis();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			it.next();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Iterator �ҿ�ð� : "+(end-start));
		
		//size ����ð�
		start = System.currentTimeMillis();
		for(int i =0; i<list.size(); i++) {
			list.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("size() �ҿ�ð� : "+(end-start));
	}

}
