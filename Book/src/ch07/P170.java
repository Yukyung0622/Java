package ch07;

class Student170 {
	
	//�ʵ�
	String name;  //�л���
	int grade; 	  //�г�
	String department;	//�а�
	
	Student170 (String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
	}
		
		// �⺻������
		Student170() {
			
		}
}



public class P170 {
	
	public void main(String[] args) {
		
		Student170 stu = new Student170 ("ȫ�浿",4,"����Ʈ���� ����");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student170 stu2 = new Student170 ("�̼���", 3, "������");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
	}
}


