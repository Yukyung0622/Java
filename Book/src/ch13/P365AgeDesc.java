package ch13;

import java.util.Comparator;

public class P365AgeDesc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//P365Memeber2�� ����ȯ
		P365Member2 m1 = (P365Member2)o1;
		P365Member2 m2 = (P365Member2)o2;
		
		//���̷� �������� ����
		return m2.age - m1.age;
	}

}
