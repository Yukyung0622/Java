package ch10;

class A { //�ٱ�Ŭ����
	A() { //�ٱ�Ŭ������ ������
		System.out.println("A��ü ����");
	}
	
	static class B { //static ���� Ŭ����
		B() { 	//static ���� Ŭ������ ������
			System.out.println("c��ü ����");
		}
		
		int var1;
		static int var2;
		
		void method1() {
			System.out.println("static ���� Ŭ������ method1()");
		}
		
		static void method2() {
			System.out.println("static ���� Ŭ������ static method2()");
		}
	}

public class P257 {  //�ν��Ͻ� ���� Ŭ����
	P257(){ //�ν��Ͻ� ���� Ŭ������ ������
		System.out.println("P257 ��ü ����");
	}
	
	int var1;
	
	void method1() {
		System.out.println("�ν��Ͻ� ���� Ŭ������ method1()");
	}
}

	void method() { //�ٱ� Ŭ���� �޼���
		
		class D {
			D(){
				System.out.println("D ��ü ����");
			}
			
			int var1;
			
			void method1() {
				System.out.println("���� ���� Ŭ������ method1()");
			}
		}
	}
}