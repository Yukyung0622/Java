package ch07;

class Student2 {
	//�ʵ� 
	String name; //�л��� 
	int grade; //�г�
	String department; //�а�
	
	//1�� ������
	Student2 () {
		
	}
	
	//2�� ������
	Student2 (String n) {
		name = n;
	}
	
	Student2 (String n, int g) {
		name = n;
		grade = g;
	}
	
	//4�� ������ 
	
	Student2 (String n, int g, String d) {
		name = n;  
		grade = g;
		department = d; 
	}
}

public class P171 {
	
	public static void main(String[] args) {
		
		
		Student2 stu1 = new Student2(); //1��������
		Student2 stu2 = new Student2("ȫ�浿"); //2��������
		Student2 stu3 = new Student2("ȫ�浿",4); //3�� ������
		Student2 stu4 = new Student2("ȫ�浿",4,"��Ʈ������ ����"); //4��������
	}

}
