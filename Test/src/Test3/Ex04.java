package Test3;

class Student {
	public static int studentId;
	private int StudentId;
	private String studentName;
	private String major;
	private int grade;
	
	public Student(String studentName, String major, int grade) {
		this.StudentId++;
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentIntfo() {
		System.out.println("============");
		System.out.println("�й� : "+StudentId);
		System.out.println("�̸� : "+studentName);
		System.out.println("���� : "+major);
		System.out.println("�г� : "+grade);
		System.out.println("------------");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
		Student.studentId = 20201000;
		
		Student kim = new Student("������", "������", 1);
		kim.studentIntfo();
		
		Student lee = new Student("�̼���", "�����а�", 1);
		lee.studentIntfo();
		
		Student lim = new Student("�Ӳ���", "�濵�а�", 1);
		lim.studentIntfo();
	}

}