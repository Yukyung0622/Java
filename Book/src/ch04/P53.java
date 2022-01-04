package ch04;

public class P53 {
	public static void main(String[] args) {
		
		int number1 = 10;
		System.out.println("number1 = 10 ->" + number1); //10출력
		number1 +=10;
		System.out.println("number1 += 10 -> " + number1 ); //20출력
		number1 -=10;
		System.out.println("number1 -= 10 ->" + number1); //10출력
		number1 *=2;
		System.out.println("number1 *= 2 ->" + number1); //20출력
		number1 /=2;
		System.out.println("number1 /= 2 -> "+ number1); //10출력
		number1 %=3;
		System.out.println("number1 %= 3 ->" + number1); //1출력
	}

}
