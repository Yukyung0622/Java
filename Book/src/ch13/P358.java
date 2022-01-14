package ch13;

import java.util.HashSet;
import java.util.Set;

public class P358 {
	
	public static void main(String[] args) {
		
		//Object타입의 배열 생성
		Object[] arr = {"홍길동","이순신","홍길동","이순신",1,2,"1","2"};
		
		//HashSet 객체 생성
		Set set = new HashSet();
		
		//set객체에 배열의 모든요소
		for(int i =0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		//출력
		System.out.println(set);
	}

}
