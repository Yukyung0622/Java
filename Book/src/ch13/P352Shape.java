package ch13;

public abstract class P352Shape {
	
	//필드
	int x, y;
	
	//생성자
	P352Shape() {
		this(0,0);
	}
	
	P352Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//추상메서드
	abstract double area();
	abstract double length();
	
	//일반메서드
	public String getLocation() {
		return "x :"+x+"y :"+y;
	}
	

}
