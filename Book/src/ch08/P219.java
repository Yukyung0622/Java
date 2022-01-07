package ch08;

public class P219 {
	
	String type;
	String name;
	
	P219(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	void sleep() {
		System.out.println(this.name + "은 잠을 잔다.");
	}
}

class Eagle extends P219{
	
	Eagle(String type, String name){
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name +"은 하늘에서 잠을 잔다.");
	}
}

class Tiger extends P219{

	Tiger(String type, String name) {
		super(type, name);
	}
	
	void sleep ( ) {
		System.out.println(this.name +"은 산속에서 잠을 잔다.");
	}
}

class Lion extends P219{

	Lion(String type, String name) {
		super(type, name);
	}
	
	void sleep () {
		System.out.println(this.name +"은 숲속에서 잠을 잔다.");
	}
}

class Shark extends P219{

	Shark(String type, String name) {
		super(type, name);
	}
	void sleep() {
		System.out.println(this.name +"은 물속에서 잠을잔다.");
	}
}
