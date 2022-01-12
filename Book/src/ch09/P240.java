package ch09;

public class P240 {
	
	public static void main(String[] args) {
		
		P240Animal eagle = new P241Eagle();
		
		eagle.sleep();
		//eagle.eat(); //에러
		
		P241Eagle eagleObj = (P241Eagle)eagle; //강제형변환
		eagleObj.eat();
	}

}
