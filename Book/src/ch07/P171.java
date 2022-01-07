package ch07;

class Student2 {
	//필드 
	String name; //학생명 
	int grade; //학년
	String department; //학과
	
	//1번 생성자
	Student2 () {
		
	}
	
	//2번 생성자
	Student2 (String n) {
		name = n;
	}
	
	Student2 (String n, int g) {
		name = n;
		grade = g;
	}
	
	//4번 생성자 
	
	Student2 (String n, int g, String d) {
		name = n;  
		grade = g;
		department = d; 
	}
}

public class P171 {
	
	public static void main(String[] args) {
		
		
		Student2 stu1 = new Student2(); //1번생성자
		Student2 stu2 = new Student2("홍길동"); //2번생성자
		Student2 stu3 = new Student2("홍길동",4); //3번 생성자
		Student2 stu4 = new Student2("홍길동",4,"소트프웨어 공학"); //4번생성자
	}

}
