package ch05;

public class Car {
	
	//�ڵ��� �Ӽ�
	private String color;
	private int speed;
	private String name;
	
	//������
	
	//�ڵ��� ���
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("=======================");
		System.out.println("�ڵ��� ���� :" +this.color);
		System.out.println("�ڵ��� ����ӵ� :" +this.speed);
		System.out.println("�ڵ��� �̸� :" +this.name);
	}
	
}
