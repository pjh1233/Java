package ch09;

public class Banana {
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("�ٳ��� ������ : "+this.country);
		System.out.println("�ٳ��� ���� : "+this.price);
	}
	@Override
	public String toString() {
		show();
		return super.toString();
	}

}
