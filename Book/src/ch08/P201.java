package ch08;


class P201 extends Parent {
	//int number = 2;
	
	P201() {
		System.out.println("�ڽ� ��ü ����");
	}


	 void print () {
		 int number = 1;
		 System.out.println(number); //�޼��� �������� number
		 System.out.println(this.number); //�ڽ� ��ü�� number
		 System.out.println(super.number); //�θ� ��ü�� number
	 }
}