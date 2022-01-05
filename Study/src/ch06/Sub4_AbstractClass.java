package ch06;

/*
 * 날짜 : 2022/01/05
 * 이름 : 김유경
 * 내용 : 자바 추상클래스 상속 실습하기 교재 p216
 * 
 */

public class Sub4_AbstractClass {
	
	public static void main(String[] args) {
		
		Unit zealot = new Zealot();
		Unit zerg = new Zerg();
		
		zealot.attack();
		zealot.move();
		
		zerg.attack();
		zerg.move();
		
		
	}

}
