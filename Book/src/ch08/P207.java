package ch08;

public class P207 {
	

	}


class Parent207 {
	String name;
	
	void walk() {
		System.out.println("�θ� �ȴ´�.");
	}
	
	void run() {
		System.out.println("�θ� �޸���.");
	}
}

class Child207 extends Parent207 {
	String name;
	
	//������ �޼���
	void run () {
		System.out.println("�ڽ��� �޸���.");
	}
	
	//�߰��� �޼���
	void eat() {
		System.out.println("�ڽ��� �Դ´�.");
	}
}
