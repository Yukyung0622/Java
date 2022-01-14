package ch13;

public class P359Member {
	
	//필드
	String name;
	int age;
	
	//생성자
	P359Member (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//toString()메서드 재정의
	@Override
	public String toString() {
		return "("+name+","+age+")";
	}
	
	//equals()메서드재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof P359Member) {
			P359Member m = (P359Member)obj;
			return this.name.equals(m.name) && this.age == m.age;
		} else {
			return false;
		}
	}
	
	//haseCode()매서드 재정의
	@Override
	public int hashCode() {
		return this.name.hashCode() + age;
	}

}
