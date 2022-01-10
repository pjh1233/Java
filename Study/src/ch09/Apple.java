package ch09;

public class Apple {
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("��� ������ : "+this.country);
		System.out.println("��� ���� : "+this.price);
	}

	@Override
	public String toString() {
		show();
		return super.toString();
	}
}
