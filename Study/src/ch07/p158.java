package ch07;

public class p158 {
	
	public static void main(String[] args) {
		
		//���� ����
		Method.printName();
		
		//��ü�� �����ؼ� ����
		Method m =new Method();
		m.printEmail();
		
	}
	
}

class Method{
	
	static void printName() {
		System.out.println("printname() ����");
		}
	
	void printEmail() {
		System.out.println("printEmail() ����");
		
		printId(); //�ٸ� �ż��� ����
	}
	
	void printId() {
		System.out.println("printId() ����");
	}
	
}
