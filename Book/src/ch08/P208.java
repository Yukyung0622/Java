package ch08;

public class P208  {
	public static void main(String[] args) {
		
		
		Child207 c = new Child207();
		
		c.run();
		
		//부모클래스의 자료형으로 선언 (자동형변환)
		Parent207 p = new Child207();
		p.run(); //재정이된 메서드가 실행
		//p.eat(); //에러

}
}

