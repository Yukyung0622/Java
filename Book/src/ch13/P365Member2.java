package ch13;

public class P365Member2 implements Comparable {
	
	//�ʵ�
	String name;
	int age;
	
	//������
	public P365Member2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//toString ()�޼��� ������
	@Override
	public String toString(){
		return "("+name+","+age+")";
	}
	
	@Override
	public int compareTo(Object o) {
		P365Member2 m = (P365Member2)o;
		return this.name.compareTo(m.name);
	}
}
