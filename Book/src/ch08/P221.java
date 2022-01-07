package ch08;

public class P221 {
	
	public static void main(String[] args) {
		
		P219[] ani_p219 = new P219[4];
		
		P219 eagle = new Eagle("조류", "독수리");
		P219 tiger = new Tiger("포유류", "호랑이");
		P219 lion = new Lion("포유류", "사자");
		P219 shark = new Shark("어류", "상어");
		
		ani_p219[0] = eagle;
		ani_p219[1] = tiger;
		ani_p219[2] = lion;
		ani_p219[3] = shark;
		
		for (int i = 0; i<ani_p219.length; i++) {
			ani_p219[i].sleep();
		}
		
	}

}
