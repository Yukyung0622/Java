package ch09;

public class P236 {
	
	public static void main(String[] args) {
		
		P236ComplexcerInterface ci = new P236ComplexcerInterface() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("����� �͸� ���� ��ü�� print()");
			}

			@Override
			public void scan() {
				// TODO Auto-generated method stub
				System.out.println("����� �͸� ���� ��ü�� scan()");
			}

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
		
		ci.send("1234");
		ci.receive("5678");
		ci.print();
		ci.scan();
	}
}
