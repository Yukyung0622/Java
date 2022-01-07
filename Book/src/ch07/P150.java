package ch07;

public class P150 {
	
	public static void main(String[] args) {
		
		Local local = new Local();
		
		System.out.println(local.name);  //null
		
		local.process();
		System.out.println(local.name);
		
		local.printAge1();
		local.printAge2();
		
	for(int i = 0; i <10; i++) {
		int temp = 0;
		temp += 0;
	}
	//System.out.println(temp); //¿¡·¯
	}

}

class Local {
	String name;
	
	void process() {
		name = "È«±æµ¿";
	}
	void printAge1() {
		int age = 20;
		System.out.println(age);
	}
	void printAge2() {
		int age = 30;
		System.out.println(age);
	}
}
