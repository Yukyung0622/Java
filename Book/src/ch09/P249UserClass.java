package ch09;

public class P249UserClass {
	
	@P249UserAnnot (value = "A")
	public void methodA() {
		System.out.println("methodA() 실행");
	}
	
	@P249UserAnnot (value = "B", number = 10)
	public void methodB() {
		System.out.println("methodB() 실행");
	}

}
