package ch08;

public class P208  {
	public static void main(String[] args) {
		
		
		Child207 c = new Child207();
		
		c.run();
		
		//�θ�Ŭ������ �ڷ������� ���� (�ڵ�����ȯ)
		Parent207 p = new Child207();
		p.run(); //�����̵� �޼��尡 ����
		//p.eat(); //����

}
}

