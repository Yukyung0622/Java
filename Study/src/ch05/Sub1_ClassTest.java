package ch05;
/*
 * ��¥ : 2022/01/05
 * �̸� : ������
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ� ���� p140
 * 
 */

public class Sub1_ClassTest {
	
	public static void main(String[] args) {
	
		//Car ��ü ����
		Car sonata = new Car("�ҳ�Ÿ" ,"���",0);
		
		//��ü�ʱ�ȭ
		//sonata.name ="�ҳ�Ÿ";
		//sonata.color = "���";
		//sonata.speed = 0;
		
		sonata.speedUp(100);
		sonata.speedDown(60);
		sonata.show();
		
		//Bmw ��ü ����
		Car bmw = new Car("520d","����",0);
		
		//��ü�ʱ�ȭ
		//bmw.name = "520d";
		//bmw.color = "����";
		//bmw.speed = 0;
		
		bmw.speedUp(60);
		bmw.speedDown(10);
		bmw.show();
		
		//Account ��ü ����
		Account kb = new Account("��������", "101-112-3456", "������", 10000);
		kb.deposit(40000);
		kb.withdraw(5000);
		
		//�ڵ� ����� - ���� : ���������� ��ü�� ������ ���� �����ϱ� ������
		//kb.balance--;
		
		kb.show();
		
		Account wr = new Account("�츮����", " 112-165-7893", "������", 20000);
		wr.deposit(40000);
		wr.withdraw(23000);
		wr.show();
		
	}

}
