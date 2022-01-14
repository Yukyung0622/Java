package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class P371 {
	
	public static void main(String[] args) {
		
		//리스트 객체 생성
		List list = new ArrayList();
		//리스트 객체에 값 추가
		for(int i = 1; i<=5; i++) {
			list.add(i);
		}
		//ListIterator 객체생성
		ListIterator lit = list.listIterator();
		//다음 요소 반복 출력
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		//이전 요소 반복 출력
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
