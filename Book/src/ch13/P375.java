package ch13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P375 {
	
	public static void main(String[] args) {
		
		//Map ��ü ����
		Map map = new HashMap();
		
		//�̸��� ��� ���ڿ� �迭 ����
		String[] names = {"ȫ�浿","������","�̼���","������","������"};
		//���ڰ� ��� ���� �迭 ����
		int[] nums = {1234,4567,2350,9870};
		
		//Map ��ü�� �� �迭�� ������ Ű�� ��� ������ ����
		for(int i = 0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		//Map ��ü���� value �鸸 ��ȸ�ϱ�
		Collection values = map.values();
		
		//���� for������ ���
		for(Object i : values) {
			System.out.println(i);
		}
		
		//Iterator ��ü�� ���
		Iterator it = values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
