package ch08;

public class P197 {
	

	public static void main(String[] args) {
		
		Phone p = new Phone();
		p.name = "전화기";
		p.company = "현대";
		p.color = "화이트";
		
		
		System.out.println("Phone 출력");
		System.out.println(p.name);
		System.out.println(p.color);
		System.out.println(p.company);
		p.call();
		p.receive();
		
		SmartPhone sp = new SmartPhone();
		sp.name = "갤럭시";
		sp.company = "삼성";
		sp.color = "블랙";
		
		System.out.println("SmartPhone 출력");
		System.out.println(sp.company);
		System.out.println(sp.name);
		System.out.println(sp.company);
		sp.call();
		sp.receive();
		sp.installApp();
	}

}


class Phone {
	String name;
	String color;
	String company;
	
	void call() {
		System.out.println("전화를 건다.");
	}
	void receive() {
		System.out.println("전화를 받다.");
	}
}

class SmartPhone extends Phone {
	public void installApp() {
		System.out.println("앱설치");
	}
}