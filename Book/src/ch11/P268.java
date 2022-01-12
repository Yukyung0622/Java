package ch11;

public class P268 {
	
	public static void main(String[] args) {
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3/0); //0으로 나눴기때문에 error
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		*/
		
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3/0);
			System.out.println(4);
		}catch (ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
		
	}

}
