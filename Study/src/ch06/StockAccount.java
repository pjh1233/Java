package ch06; 
//������

public class Account {
	                  
	// �Ӽ� (�ʵ�):
	
	//���
	protected String bank;
	protected String stock;
	protected int amount;
	protected int price;
	
	public  {
		super(bank, id, name, balance);
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	public void deposit() {}
	public void withdraw() {}
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		balance += amount * price;
	}
	public void buy(int amount, int pirce) {
		this.amount += amount;
		balance -= amount * price;
		super.balance
	}
	
	public void show() {
		System.out.println("===========");
		System.out.println("���ǻ� : "+"bank");
		System.out.println("���¹�ȣ : "+"id");
		System.out.println("�Ա��� : "+"name");
		System.out.println("�����ܾ� : "+"balance");
		System.out.println("�ֽ����� : "+"stock");
		System.out.println("���� : "+"amount");
		System.out.println("���� : "+"price");
		System.out.println("===========");
	}
}
