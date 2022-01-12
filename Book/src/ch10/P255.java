package ch10;

public class P255 { //바깥클래스 
	
	int i = 0;
	
	void outerMethod() {
		class Inner {	//로컬클래스
			int x = 20;  //메서드 지연변수
			int i =30;   //메서드 지역변수
			void innerMethod() {
				
			System.out.println(x);	
			System.out.println(i); //안쪽 클래스의 i변수
			System.out.println(this.i); //안쪽 클래스의 i 변수
			System.out.println(P255.this.i); //바깥 클래스의 i 변수
				
			}
		}
		
		Inner inn = new Inner();
		inn.innerMethod();
	
	}
	
	//static 내부클래스나 인스턴스 내부클래스는 바깥클래스의 멤버와 같은 위치에
	//선언했으나, 로컬클래스는 바깥클래스의 메서드 내에 선언된다.
	public static void main(String[] args) {
		P255 lic = new P255();
		lic.outerMethod();
	}

}
