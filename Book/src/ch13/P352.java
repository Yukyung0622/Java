package ch13;

import java.util.List;
import java.util.ArrayList;

public class P352 {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		//list ��ü�� ��� �߰�
		list.add(new P352Circle(3.0));
		list.add(new P352Rectangle(3,4));
		list.add(new P352Circle(5));
		list.add(new P352Rectangle(5,6));
		
		System.out.println("��ü ������ ������ �� :"+getArea(list));
		System.out.println("��ü ������ �ѷ��� �� :"+getLength(list));
	}
	
	private static double getLength(List list) {
		double value = 0;
		
		for(int i =0; i<list.size(); i++) {
			//list����ȯ
			P352Shape s = (P352Shape)list.get(i);
			value += s.length();
		}
		
		return value;
	}
	
	private static double getArea(List list) {
		double value = 0;
		
		for(int i =0; i<list.size(); i++) {
			//list ��ü ����ȯ�� �޼��� ȣ�� ���ÿ�
			value += ((P352Shape)list.get(i)).area();
		}
		return value;
	}

}
