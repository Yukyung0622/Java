package ch13;

import java.util.Comparator;
import java.util.TreeSet;

public class P365 {
	public static void main(String[] args) {
		
		//�̸� ������ ����
		TreeSet set = new TreeSet();
		
		set.add(new P365Member2("ȫ�浿", 30));
		set.add(new P365Member2("�̼���", 40));
		set.add(new P365Member2("������", 50));
		System.out.println(set);
		
		//���� ������������ �����Ͽ� ���(�͸� Ŭ������ �������̽� ����)
		TreeSet set2 = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				P365Member2 m1 = (P365Member2)o1;
				P365Member2 m2 = (P365Member2)o2;
				return m1.age - m2.age;
			}
		});
		
		set2.add(new P365Member2("ȫ�浿", 30));
		set2.add(new P365Member2("�̼���", 40));
		set2.add(new P365Member2("������", 50));
		System.out.println(set2);
		
		//�̸��� ������������ �����Ͽ� ���
		TreeSet set3 = new TreeSet(new P365NameDesc());
		set3.add(new P365Member2("ȫ�浿", 30));
		set3.add(new P365Member2("�̼���", 40));
		set3.add(new P365Member2("������", 50));
		System.out.println(set3);
		
		//������ ������������ �����Ͽ� ���
		TreeSet set4 = new TreeSet(new P365AgeDesc());
		set4.add(new P365Member2("ȫ�浿", 30));
		set4.add(new P365Member2("�̼���", 40));
		set4.add(new P365Member2("������", 50));
		System.out.println(set4);
	}

}
