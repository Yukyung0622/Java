package ch07;

class Student167 {
	
	String name;
	int grade;
	String department;
	
	Student167 (String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
	}
}

public class P167 {
	
	public static void main(String[] args) {
		
		Student167 stu = new Student167("ȫ�浵", 4, "����Ʈ���� ����");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
	}

}
