package ch07;

public class P172 {
	
	String name; //학생명
	int grade; //학년
	String department; //학과
	
	//1번 생성자
	P172 (){
		
	}
	
	//2번 생성자
	P172(String n ) {
		name = n;
	}
	
	//3번 생성자
	P172(String n, int g) {
		name = n;
		grade = g;
	}
	
	//4번 생성자
	P172(String n, int g , String d) {
		name = n;
		grade = g;
		department = d;
	}
	
	//학과와 학년을 매개변수로 받는 생성자 (에러발생)
	//P172 (String d, int g) {
		//department = d;
		//grade = g;
	//}
	
	

}
