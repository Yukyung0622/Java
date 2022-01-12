package ch09;

public class P234 {
	
	public static void main(String[] args) {
		
		P232Complexer com = new P232Complexer();
		System.out.println(P232Complexer.INK);
		System.out.println(P232Complexer.FAX_NUMBER);
		
		com.print();
		com.scan();
		com.send("02-8465-5531");
		com.receive("02-8465-5531");
	}

}
