package ch09;

public class P232Complexer implements P232Printer,P232Scanner,P232Fax{

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("스캔 실행");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("출력 실행");
	}

	@Override
	public void send(String tel) {
		// TODO Auto-generated method stub
		System.out.println(FAX_NUMBER + "에서"+ tel +"로 FAX 전송");
	}

	@Override
	public void receive(String tel) {
		// TODO Auto-generated method stub
		System.out.println(tel+"에서"+FAX_NUMBER+"로 FAX 수신");
	}
	

}
