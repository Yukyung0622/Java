package ch13;

import java.util.Comparator;

public class P365NameDesc implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		//P365Member2�� ����ȯ
		P365Member2 m1 = (P365Member2)o1;
		P365Member2 m2 = (P365Member2)o2;
		
		//�̸����� �������� ����
		return m1.compareTo(m2)*(-1);
	}
	
	

}
