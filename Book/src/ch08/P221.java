package ch08;

public class P221 {
	
	public static void main(String[] args) {
		
		P219[] ani_p219 = new P219[4];
		
		P219 eagle = new Eagle("����", "������");
		P219 tiger = new Tiger("������", "ȣ����");
		P219 lion = new Lion("������", "����");
		P219 shark = new Shark("���", "���");
		
		ani_p219[0] = eagle;
		ani_p219[1] = tiger;
		ani_p219[2] = lion;
		ani_p219[3] = shark;
		
		for (int i = 0; i<ani_p219.length; i++) {
			ani_p219[i].sleep();
		}
		
	}

}
