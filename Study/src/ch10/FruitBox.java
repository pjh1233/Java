package ch10;

import ch09.Apple;

public class FruitBox<T> {

	private T fruit;
	
	//getter : �������(�Ӽ�)�� �ܺο� �����ϴ� �޼���
	public T getFruit() {
		return fruit;
	}
	
	
	//setter : �������(�Ӽ�)�� ���� �ܺο��� �����ϴ� �޼���
	public void setFruit(T fruit) {
		this.fruit = fruit;	
	}
	
}
