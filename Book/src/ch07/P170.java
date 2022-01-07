package ch07;

class Student170 {
	
	//필드
	String name;  //학생명
	int grade; 	  //학년
	String department;	//학과
	
	Student170 (String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
	}
		
		// 기본생성자
		Student170() {
			
		}
}



public class P170 {
	
	public void main(String[] args) {
		
		Student170 stu = new Student170 ("홍길동",4,"소프트웨어 공학");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student170 stu2 = new Student170 ("이순신", 3, "디자인");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
	}
}


