package ch09;

public class P235 {
	
	public static void main(String[] args) {
		
		P232Fax fax = new P232Fax() {

			@Override
			public void send(String tel) {
				// TODO Auto-generated method stub
				System.out.println("����� �͸� ���� ��ü�� send()");
			}

			@Override
			public void receive(String tel) {
				// TODO Auto-generated method stub
				System.out.println("����� �͸� ���� ��ü�� receive()");
				
			}	
		};
		
		fax.send("1234");
		fax.receive("4567");
	}

}
