package ch04;

public class P61 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		//AND 연산
		System.out.println(a>b && a==10); //true
		System.out.println(a>b && a==b); //false
		
		//OR연산
		System.out.println(a>b || a == b); //true
		System.out.println(a<b || a == b); //false
		
		//XOR연산
		System.out.println(a>b ^ a==10); //false
		System.out.println(a>b ^ a==b); //true
		
		//NOT연산
		System.out.println(!(a>b));  //false
		System.out.println(!(a<b)); //true

	}

}
