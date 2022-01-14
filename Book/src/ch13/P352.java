package ch13;

import java.util.List;
import java.util.ArrayList;

public class P352 {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		//list 객체에 요소 추가
		list.add(new P352Circle(3.0));
		list.add(new P352Rectangle(3,4));
		list.add(new P352Circle(5));
		list.add(new P352Rectangle(5,6));
		
		System.out.println("전체 도형의 면적의 합 :"+getArea(list));
		System.out.println("전체 도형의 둘레의 합 :"+getLength(list));
	}
	
	private static double getLength(List list) {
		double value = 0;
		
		for(int i =0; i<list.size(); i++) {
			//list형변환
			P352Shape s = (P352Shape)list.get(i);
			value += s.length();
		}
		
		return value;
	}
	
	private static double getArea(List list) {
		double value = 0;
		
		for(int i =0; i<list.size(); i++) {
			//list 객체 형변환과 메서드 호출 동시에
			value += ((P352Shape)list.get(i)).area();
		}
		return value;
	}

}
