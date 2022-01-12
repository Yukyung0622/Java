package ch09;

public class P239Computer {
	
	public static void main(String[] args) {
		
		P238GraphicCard gc = new P238Amd();
		
		System.out.println("메모리 : "+gc.MEMORY);
		
		//Amd로 생성
		gc = new P238Amd(); //자동형변환
		gc.process();
		
		//Nvidia로 교체
		gc = new P238Nvidia(); //자동형변환
		gc.process();
	}

}
