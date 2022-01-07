package ch08;


class P201 extends Parent {
	//int number = 2;
	
	P201() {
		System.out.println("자식 객체 생성");
	}


	 void print () {
		 int number = 1;
		 System.out.println(number); //메서드 지역변수 number
		 System.out.println(this.number); //자신 객체의 number
		 System.out.println(super.number); //부모 객체의 number
	 }
}