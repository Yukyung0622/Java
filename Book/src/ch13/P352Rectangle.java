package ch13;


public class P352Rectangle extends P352Shape {
	
	//�ʵ�
	int w,h;
	
	//������
	P352Rectangle () {
		this(1,1);
	}
	P352Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	//�޼��� ������(�������̵�)
	@Override
	double area() {
		return (w * h);
	}
	@Override
	double length() {
		return (w + h) * 2;
	}
	
	
}
