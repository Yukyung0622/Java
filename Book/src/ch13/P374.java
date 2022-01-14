package ch13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class P374 {
	
	public static void main(String[] args) {
		
		//Map ��ü ����
		Map map = new HashMap();
		
		//�̸��� ��� ���ڿ� �迭����
		String[] names = {"ȫ�浿","������","�̼���","������","������"};
		//���ڰ� ��� ���� �迭 ����
		int[] nums = {1234,4567,2350,9870,2345};
		
		//Map ��ü�� �� �迭�� ������ Ű�� ��� ������ ����
		for(int i = 0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		//Map��ü���� key �鸸 ��ȸ�ϱ�
		Set<String>keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + "="+map.get(key));
			System.out.println("Iterator�� ���");
			Iterator it = keys.iterator();
			while(it.hasNext()) {
				String a = (String)it.next();
				System.out.println(a+"="+map.get(a));
			}
		}
		
	}

}
