package ch08;

public class P197 {
	

	public static void main(String[] args) {
		
		Phone p = new Phone();
		p.name = "��ȭ��";
		p.company = "����";
		p.color = "ȭ��Ʈ";
		
		
		System.out.println("Phone ���");
		System.out.println(p.name);
		System.out.println(p.color);
		System.out.println(p.company);
		p.call();
		p.receive();
		
		SmartPhone sp = new SmartPhone();
		sp.name = "������";
		sp.company = "�Ｚ";
		sp.color = "��";
		
		System.out.println("SmartPhone ���");
		System.out.println(sp.company);
		System.out.println(sp.name);
		System.out.println(sp.company);
		sp.call();
		sp.receive();
		sp.installApp();
	}

}


class Phone {
	String name;
	String color;
	String company;
	
	void call() {
		System.out.println("��ȭ�� �Ǵ�.");
	}
	void receive() {
		System.out.println("��ȭ�� �޴�.");
	}
}

class SmartPhone extends Phone {
	public void installApp() {
		System.out.println("�ۼ�ġ");
	}
}