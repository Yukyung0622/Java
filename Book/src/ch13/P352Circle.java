package ch13;

public class P352Circle extends P352Shape {
	
	//�ʵ�
	double r;
	
	//������
	P352Circle(){
		this (1);
	}
	P352Circle(double r){
		this.r =r;
	}
	
	//�޼��� ������(�������̵�)
	@Override
	double area() {
		return (r*r) * Math.PI;
	}
	@Override
	double length() {
		return (r*2) * Math.PI;
	}
	
}
