package ch08;
import ch08.P214;

public class P215 {
	
	public void methodB() {
		Aclass ac = new Aclass();
		ac.varA = "varA";
		ac.varA2 = "varA2";
		ac.methodA();
		ac.methodA2();
	}

}


class CClass extends Aclass {
	CClass() {
		this.varA = "varA";
		this.varA2 = "varA2";
		this.methodA();
		this.methodA2();
	}
}