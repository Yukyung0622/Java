package ch13;

public abstract class P352Shape {
	
	//�ʵ�
	int x, y;
	
	//������
	P352Shape() {
		this(0,0);
	}
	
	P352Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//�߻�޼���
	abstract double area();
	abstract double length();
	
	//�Ϲݸ޼���
	public String getLocation() {
		return "x :"+x+"y :"+y;
	}
	

}
