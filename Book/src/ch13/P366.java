package ch13;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P366 {
	
	public static void main(String[] args) {
		
		//Iterator ��ü����
		Iterator it = null;
		
		//List��ü�� Set��ü����
		List list = new ArrayList();
		Set set = new HashSet();
		
		//list �� set�� 5���� �� �߰�
		for(int i = 1; i<=5; i++) {
			list.add(i);
			set.add(i+5);
		}
		
		//���
		System.out.println(list);
		System.out.println(set);
		
		//list���� Interator ��ü�� ����
		it = (list).iterator();
		
		//lit�� Iterator ��ü���
		System.out.println("List Iterator ���");
		iteratorPrint(it);
		
		//set���� Iterator ��ü�� ����
		it = set.iterator();
		
		//set���� Interator ��ü�� ����
		System.out.println("Set Iterator���");
		iteratorPrint(it);
		
		//���
		System.out.println(list);
		System.out.println(set);
	}
	
	private static void iteratorPrint(Iterator it) {
		//Iterator ��ü �ݺ�(���� ��Ұ� ������ �ݺ�)
		while (it.hasNext()){
			//Iterator ��ü�� ���� ��� �о�� ���
			System.out.println(it.next());
			//���� ��� ����
			it.remove();
			}
		}

}