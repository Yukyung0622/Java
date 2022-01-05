package ch05;
/*
 * 날짜 : 2022/01/05
 * 이름 : 김유경
 * 내용 : 자바 클래스 실습하기 교재 p140
 * 
 */

public class Sub1_ClassTest {
	
	public static void main(String[] args) {
	
		//Car 객체 생성
		Car sonata = new Car("소나타" ,"흰색",0);
		
		//객체초기화
		//sonata.name ="소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		sonata.speedUp(100);
		sonata.speedDown(60);
		sonata.show();
		
		//Bmw 객체 생성
		Car bmw = new Car("520d","남색",0);
		
		//객체초기화
		//bmw.name = "520d";
		//bmw.color = "남색";
		//bmw.speed = 0;
		
		bmw.speedUp(60);
		bmw.speedDown(10);
		bmw.show();
		
		//Account 객체 생성
		Account kb = new Account("국민은행", "101-112-3456", "김유신", 10000);
		kb.deposit(40000);
		kb.withdraw(5000);
		
		//코드 취약점 - 원인 : 참조변수로 객체의 변수를 직접 참조하기 때문에
		//kb.balance--;
		
		kb.show();
		
		Account wr = new Account("우리은행", " 112-165-7893", "김춘추", 20000);
		wr.deposit(40000);
		wr.withdraw(23000);
		wr.show();
		
	}

}
