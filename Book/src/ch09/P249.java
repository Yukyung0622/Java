package ch09;

import java.lang.reflect.Method;

public class P249 {
	
	public static void main(String[] args) throws Exception {
		Method method[] = P249UserClass.class.getDeclaredMethods();
		
		for(int i =0; i<method.length; i++) {
			String methodName = method[i].getName();
			P249UserAnnot annot = method[i].getAnnotation(P249UserAnnot.class);
			
			System.out.print(methodName +"의 어노테이션");
			System.out.print("value : "+annot.value()+" ");
			System.out.print("number : "+annot.number()+" ");
			System.out.println();
			
			method[i].invoke(new P249UserClass(), null); //메서드 실행
		}
		
	}

}
