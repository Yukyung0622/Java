package Test2;

public class Ex09 {
	
	public static void main(String[] args) {
		
		System.out.println("1�� 5�� �ִ� ����� : "+gcd(1,5));
		System.out.println("3�� 6�� �ִ� ����� : "+gcd(3,6));
		System.out.println("12�� 18�� �ִ� ����� : "+gcd(12,18));
		System.out.println("60�� 24�� �ִ� ����� : "+gcd(60,24));
		System.out.println("192�� 162�� �ִ� ����� : "+gcd(192,162));
	
	}
	
	public static int gcd (int a, int b) {
		if(a%b ==0) {
			return b;
		} else {
			return gcd(b,a%b);
		}
	}

}
