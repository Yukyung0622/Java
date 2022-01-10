package ch09;

/*
 * 날짜 : 2022/01/10
 * 이름 : 김유경
 * 내용 : 자바 String 내장클래스 실습 교재 p302
 */
public class Sub2_StringTest {
	public static void main(String[] args) {
		
		//문자열 비교
		String str1 = "hello";
		String str2 = new String("hello");
		
		if(str1 == str2) {
			System.out.println("str1 참조값과 str2참조값는 같다");
		}else {
			System.out.println("str1 참조값과 str1참조값은 다르다");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1 문자열과 str2문자열은 같다");
		}else {
			System.out.println("str1 문자열과 str2문자열은 다르다");
		}
		
		//문자열 길이
		String hello = "Hello Korea";
		
		System.out.println("문자열 hello 길이 :"+hello.length());
		
		//문자열 추출
		System.out.println("문자열 hello 1번째 문자 :"+hello.charAt(0));
		System.out.println("문자열 hello 7번째 문자 :"+hello.charAt(1));
		
		//문자열 자르기
		System.out.println("문자열 hello 1~6까지 자르기 :"+hello.substring(0,5));
		System.out.println("문자열 hello 7부터 마지막 까지 자르기 :"+hello.substring(6));
		
		//문자열 인덱스
		System.out.println("문자열 hello 앞에서 부터 문자 e인덱스 : " +hello.indexOf("e"));
		System.out.println("문자열 hello 뒤에서 부터 문자 e인덱스 : " +hello.lastIndexOf("e"));
		
		//문자열 교체
		System.out.println("문자열 'Korea'를 'Busan'으로 교체 : "+hello.replace("Korea", "Busan"));
		
		//문자열 변환
		int 	var1 = 1;
		double  var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3; //.value Of()의 약자 //""->빈문자열 
		//""+var3 이렇게 적어도 되고(보통은 앞에 식을 사용), var3+"" 가능하다
		
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		System.out.println("s3 :"+s3);
		
		System.out.println(s1.getClass().getName()); //타입확인
		System.out.println(s2.getClass().getName()); //타입확인
		System.out.println(s3.getClass().getName()); //타입확인
	}

}
