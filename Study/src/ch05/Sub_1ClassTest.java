package ch05;
/*
 * ��¥ : 2022 01 05
 * �̸� : ������
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ� ���� p140
 * 
 */
public class Sub_1ClassTest {
	public static void main(String[] args) {

		// Car��ü ����
	
		
		// bmw ��ü
		Car bmw = new Car();
		
		// ��ü �ʱ�ȭ
	
		
		bmw.speedUp(60);
		bmw.speedDown(10);
		bmw.show();
		
		// Account ��ü ����
		Account kb = new Account("��������", "jh1233", "������", 10000);
		
		
		kb.deposit(40000);
		kb.withdraw(5000);
		
		// ���������� ��ü�� ������ ���� �����ؼ� ����� �߻�  �� ĸ��ȭ �������� ����ڵ� ����
		//kb.balance--;
		
		kb.show();
		
		Account wr = new Account("�츮����", "jh1234", "����", 30000);

		
		wr.deposit(10000);
		wr.withdraw(12000);
		wr.show();
		
		}
}













