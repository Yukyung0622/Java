package ch03;

/*
 * 날짜 : 2021/12/31
 * 이름 : 김유경
 * 내용 : 변수의 범위 p45
 */

public class P45_ScopeEx { //1.클래스 변수
	
	int no; // 클래서
	
	public static void main(String[] args) {
		
		String name;
		
		if(true) {
			// 메서드 블럭안에서 선언한 변수 사용 가능
			name = "홍길동";
			// if문 블럭안에서 변수 선언
			String email = "hong@test.com";
					
		}
		//if문 블럭 밖에서 email 변수를 사용하면 에러 발생
		String email = "hong@test.com";
		
	}

}
