package ch09;

public class P240 {
	
	public static void main(String[] args) {
		
		P240Animal eagle = new P241Eagle();
		
		eagle.sleep();
		//eagle.eat(); //����
		
		P241Eagle eagleObj = (P241Eagle)eagle; //��������ȯ
		eagleObj.eat();
	}

}
