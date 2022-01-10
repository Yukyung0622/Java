package ch06;

public class P114 {
	
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		//idx에 변수 선언 , 인덱스 값을 담을 변수로 초기화는 0
		int idx = 0;
		while(true) { //조건은 true로 지정
			//중복된 번호가 몇번 나올지 모르니, 무한반복으로 하고
			//while문 안에서 로또번호를 다 채우면 반복이 중지된다.
			//int 로 강제 형변환, 소주점이 사라지니깐 0~44 +1 더한것
			int number = (int) (Math.random()*45)+1;
			
			//중복여부를 확인하여 중복되면 false로 변경
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
			
			//idx값이 6개가 채워지면 while문 중지
			if(idx == 6) break;
		}
		
		for(int i =0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}
