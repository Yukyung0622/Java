package ch06;

public class P114 {
	
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		//idx�� ���� ���� , �ε��� ���� ���� ������ �ʱ�ȭ�� 0
		int idx = 0;
		while(true) { //������ true�� ����
			//�ߺ��� ��ȣ�� ��� ������ �𸣴�, ���ѹݺ����� �ϰ�
			//while�� �ȿ��� �ζǹ�ȣ�� �� ä��� �ݺ��� �����ȴ�.
			//int �� ���� ����ȯ, �������� ������ϱ� 0~44 +1 ���Ѱ�
			int number = (int) (Math.random()*45)+1;
			
			//�ߺ����θ� Ȯ���Ͽ� �ߺ��Ǹ� false�� ����
			boolean insert = true;
			for(int i = 0; i<idx; i++) {
				if(lotto[i] == number) {
					insert = false;
					break;
				}
			}
			

			if(insert == true) {
				lotto[idx] = number;
				idx++;
			}
			
			//idx���� 6���� ä������ while�� ����
			if(idx == 6) break;
		}
		
		for(int i =0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}
