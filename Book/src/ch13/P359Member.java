package ch13;

public class P359Member {
	
	//�ʵ�
	String name;
	int age;
	
	//������
	P359Member (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//toString()�޼��� ������
	@Override
	public String toString() {
		return "("+name+","+age+")";
	}
	
	//equals()�޼���������
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof P359Member) {
			P359Member m = (P359Member)obj;
			return this.name.equals(m.name) && this.age == m.age;
		} else {
			return false;
		}
	}
	
	//haseCode()�ż��� ������
	@Override
	public int hashCode() {
		return this.name.hashCode() + age;
	}

}
