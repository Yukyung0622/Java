package ch08;

public class P209 {

}

class GraphicCard {
	int memory;
	
	public void process() {
		System.out.println("�׷��� ó��");
	}
}

class Amd extends GraphicCard{
	public void process() {
		System.out.println("AMD �׷��� ó��");
	}
}

class Nvidia extends GraphicCard {
	public void process() {
		System.out.println("Nvidia �׷��� ó��");
	}
}
