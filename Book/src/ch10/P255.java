package ch10;

public class P255 { //�ٱ�Ŭ���� 
	
	int i = 0;
	
	void outerMethod() {
		class Inner {	//����Ŭ����
			int x = 20;  //�޼��� ��������
			int i =30;   //�޼��� ��������
			void innerMethod() {
				
			System.out.println(x);	
			System.out.println(i); //���� Ŭ������ i����
			System.out.println(this.i); //���� Ŭ������ i ����
			System.out.println(P255.this.i); //�ٱ� Ŭ������ i ����
				
			}
		}
		
		Inner inn = new Inner();
		inn.innerMethod();
	
	}
	
	//static ����Ŭ������ �ν��Ͻ� ����Ŭ������ �ٱ�Ŭ������ ����� ���� ��ġ��
	//����������, ����Ŭ������ �ٱ�Ŭ������ �޼��� ���� ����ȴ�.
	public static void main(String[] args) {
		P255 lic = new P255();
		lic.outerMethod();
	}

}
