package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class P371 {
	
	public static void main(String[] args) {
		
		//����Ʈ ��ü ����
		List list = new ArrayList();
		//����Ʈ ��ü�� �� �߰�
		for(int i = 1; i<=5; i++) {
			list.add(i);
		}
		//ListIterator ��ü����
		ListIterator lit = list.listIterator();
		//���� ��� �ݺ� ���
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		//���� ��� �ݺ� ���
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
