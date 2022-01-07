package ch08;

public class P204 {
	
	public static void main(String[] args) {
		
		Taxi t = new Taxi();
		t.go();
	}
}


class Car {
	
	String color;
	String name;
	
	public void go() {
		System.out.println("전진");
	}
	
	void back () {
		System.out.println("후진");
	}
}

class Taxi extends Car {
	public void go() {
		System.out.println("미터기를 켜고 전진");
	}
}