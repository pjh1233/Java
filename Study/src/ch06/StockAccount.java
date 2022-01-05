package ch06;

public class Account {
	                  
	// 속성 (필드):
	
	//상속
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
		System.out.println("증권사 : "+"bank");
		System.out.println("계좌번호 : "+"id");
		System.out.println("입금주 : "+"name");
		System.out.println("현재잔액 : "+"balance");
		System.out.println("주식종목 : "+"stock");
		System.out.println("수량 : "+"amount");
		System.out.println("가격 : "+"price");
		System.out.println("===========");
	}
}
