package ch13;

public class P352Circle extends P352Shape {
	
	//필드
	double r;
	
	//생성자
	P352Circle(){
		this (1);
	}
	P352Circle(double r){
		this.r =r;
	}
	
	//메서드 재정의(오버라이딩)
	@Override
	double area() {
		return (r*r) * Math.PI;
	}
	@Override
	double length() {
		return (r*2) * Math.PI;
	}
	
}
