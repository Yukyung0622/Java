package ch10;

import ch09.Apple;
import ch09.Banana;

public class FruitBox<T> {
	
	//T�� ġȯ����
	private T fruit;
	
	//getter : �������(�Ӽ�)�� �ܺο� �����ϴ� �޼���
	public T getFruit() {
		return fruit;
	}
	
	//setter : �������(�Ӽ�)�� ����  �ܺο��� �����ϴ� �޼���
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

}