package ch11;

public class P268 {
	
	public static void main(String[] args) {
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3/0); //0���� �����⶧���� error
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