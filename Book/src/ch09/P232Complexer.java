package ch09;

public class P232Complexer implements P232Printer,P232Scanner,P232Fax{

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("��ĵ ����");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("��� ����");
	}

	@Override
	public void send(String tel) {
		// TODO Auto-generated method stub
		System.out.println(FAX_NUMBER + "����"+ tel +"�� FAX ����");
	}

	@Override
	public void receive(String tel) {
		// TODO Auto-generated method stub
		System.out.println(tel+"����"+FAX_NUMBER+"�� FAX ����");
	}
	

}
