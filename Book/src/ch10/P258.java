package ch10;

public class P258 {
	
	public static void main(String[] args) {
		A a = new A();
		
		//static ��� Ŭ���� ��ü ����
		A.B b = new A.B();
		b.var1 =3;
		b.method1();
		A.B.var2 = 3;
		A.B.method2();
		
		//�ν��Ͻ� ���� Ŭ���� ��ü ����
		A.P257 p257 = a.new P257();
		p257.var1 =3;
		p257.method1();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}

}