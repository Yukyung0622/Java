package ch08;

public class P207 {
	

	}


class Parent207 {
	String name;
	
	void walk() {
		System.out.println("부모가 걷는다.");
	}
	
	void run() {
		System.out.println("부모가 달린다.");
	}
}

class Child207 extends Parent207 {
	String name;
	
	//재정의 메서드
	void run () {
		System.out.println("자식이 달린다.");
	}
	
	//추가된 메서드
	void eat() {
		System.out.println("자식이 먹는다.");
	}
}
