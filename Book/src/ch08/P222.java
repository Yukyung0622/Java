package ch08;

public class P222 {
	
	//������ ������ �޼���
	void method() {
		
	}

	//�����ǰ� �Ұ����� �޼���
	final void finalMethod() {
		
	}
}

class SubFinalMehod extends P222{
	
	void method() {//������ ����
		System.out.println("method() ������");
	}
	
	//void finalMethod() {//������ �Ұ�
		//System.out.println("finalMethod() ������");
	//}
}