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
		System.out.println("����");
	}
	
	void back () {
		System.out.println("����");
	}
}

class Taxi extends Car {
	public void go() {
		System.out.println("���ͱ⸦ �Ѱ� ����");
	}
}