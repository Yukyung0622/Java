package ch08;

public class P209 {

}

class GraphicCard {
	int memory;
	
	public void process() {
		System.out.println("그래픽 처리");
	}
}

class Amd extends GraphicCard{
	public void process() {
		System.out.println("AMD 그래픽 처리");
	}
}

class Nvidia extends GraphicCard {
	public void process() {
		System.out.println("Nvidia 그래픽 처리");
	}
}
