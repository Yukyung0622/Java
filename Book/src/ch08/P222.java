package ch08;

public class P222 {
	
	//재정의 가능한 메서드
	void method() {
		
	}

	//재정의가 불가능한 메서드
	final void finalMethod() {
		
	}
}

class SubFinalMehod extends P222{
	
	void method() {//재정의 가능
		System.out.println("method() 재정의");
	}
	
	//void finalMethod() {//재정의 불가
		//System.out.println("finalMethod() 재정의");
	//}
}