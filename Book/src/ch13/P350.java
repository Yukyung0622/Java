package ch13;

import java.util.Vector;

public class P350 {
	
	public static void main(String[] args) {
		
		Vector list = new Vector();
		list.add(1.2); //List메서드 
		list.add(Math.PI); //List메서드 
		list.addElement(3.4); //이전메서드 
		
		//향상된 for문
		for(Object o : list) {
			System.out.println(o);
		}
		double num = 3.4;
		
		//해당 요소의 인덱스 (없으면 -1)
		int index = list.indexOf(null);
		if(index >= 0) { //요소가 존재함
			System.out.println(num+"의 위치 :" +index);
		}else { //요소가 존재하지않음
			System.out.println(num + "는 list에 없습니다.");
		}
		
		num = 1.2;
		//값이 존재하는지 확인
		if(list.contains(num)) {
			//제거(이전메서드)
			list.removeElement(num +"삭제됨");
		}
		
		//해당 요소의 인덱스 (없으면 -1)
		System.out.println(list.indexOf(num));
		System.out.println(list); //toString()
		}
}
