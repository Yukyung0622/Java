package ch10;

class A { //바깥클래스
	A() { //바깥클래스의 생성자
		System.out.println("A객체 생성");
	}
	
	static class B { //static 내부 클래스
		B() { 	//static 내부 클래스의 생성자
			System.out.println("c객체 생성");
		}
		
		int var1;
		static int var2;
		
		void method1() {
			System.out.println("static 내부 클래스의 method1()");
		}
		
		static void method2() {
			System.out.println("static 내부 클래스의 static method2()");
		}
	}

public class P257 {  //인스턴스 내부 클래스
	P257(){ //인스턴스 내부 클래스의 생성자
		System.out.println("P257 객체 생성");
	}
	
	int var1;
	
	void method1() {
		System.out.println("인스턴스 내부 클래스의 method1()");
	}
}

	void method() { //바깥 클래스 메서드
		
		class D {
			D(){
				System.out.println("D 객체 생성");
			}
			
			int var1;
			
			void method1() {
				System.out.println("로컬 내부 클래스의 method1()");
			}
		}
	}
}