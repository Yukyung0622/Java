package ch03;
/*
 * 날짜 : 2021/12/31
 * 이름 : 김유경
 * 내용 : 변수형 p48
 */

public class P48_Casting_Ex3 {
	public static void main(String[] args) {
		//강제형 변환예시
		double score = 100; //double 자료형
		int score2 = (int)score; //강제형변환
		
		System.out.println(score2); //값의 손실 발생하지 않음
	}

}
