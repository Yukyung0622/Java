package ch13;


public class P352Rectangle extends P352Shape {
	
	//필드
	int w,h;
	
	//생성자
	P352Rectangle () {
		this(1,1);
	}
	P352Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	//메서드 재정의(오버라이딩)
	@Override
	double area() {
		return (w * h);
	}
	@Override
	double length() {
		return (w + h) * 2;
	}
	
	
}
