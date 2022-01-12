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
		System.out.println("학번 : "+StudentId);
		System.out.println("이름 : "+studentName);
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+grade);
		System.out.println("------------");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
		Student.studentId = 20201000;
		
		Student kim = new Student("김유신", "국문과", 1);
		kim.studentIntfo();
		
		Student lee = new Student("이순신", "경제학과", 1);
		lee.studentIntfo();
		
		Student lim = new Student("임꺽정", "경영학과", 1);
		lim.studentIntfo();
	}

}
