package ch07;

public class P186 {
	
	//static ����
	private static P186 instance = new P186();
	
	//�����ڿ� private ���� ������
	private P186() {
		System.out.println("��ü ����");
	}
	
	//static �޼���
	public static P186 getInstance() {
		System.out.println("��ü ����");
		return instance;
	}

}


class SingletonMain {
	public static void main(String[] args) {
		//Singleton s = new Singleton(); //�����߻�
		
		P186 s1 = P186.getInstance();
		P186 s2 = P186.getInstance();
		P186 s3 = P186.getInstance();
	}
}
