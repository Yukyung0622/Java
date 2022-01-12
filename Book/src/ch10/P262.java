package ch10;

public class P262 {
	
	public static void main(String[] args) {
		
		P259 p259 = new P259();
		p259.setInterfaceEx(new P260());
		p259.outerMethod();
		p259.setInterfaceEx(new P261());
		p259.outerMethod();
	}
}
