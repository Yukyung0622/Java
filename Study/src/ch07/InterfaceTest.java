package ch07;
/*
 * ��¥ : 2022/01/05
 * �̸� : ������
 * ���� : �ڹ� �������̽� ��� �ǽ��ϱ� ���� p228
 * 
 */

public class InterfaceTest {
	
	public static void main(String[] args) {
		
		//�������̽��� ���� Ŭ���� ���� ����
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chDown();
		lg.soundDown();
		lg.powerOff();
		
		samsung.powerOn();
		samsung.chUp();
		samsung.chDown();
		samsung.soundUp();
		samsung.powerOn();
		
		//�������̽��� �̿��� ���յ� ��ȭ
		Bulb bulb = new Bulb();
		Socket scoket = new Cable(bulb);
		
		scoket.switchOn();
		scoket.switchOff();
		
	}

}
