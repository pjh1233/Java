package ch07;

public class p145 {
	
	public static void main(String [] args) {
		
		//Car Ÿ���� �迭��ü ����
		Car[] cars = new Car[3];
		
		//Car ��ü ����
		Car tico = new Car();
		tico.color = "ȭ��Ʈ";
		tico.company = "���";
		tico.type = "����";
		
		//��� �ε����� tico����
		for (int i=0; i<cars.length; i++) {
			cars[i] = tico;
		}
		
		System.out.println("2�� �ε��� color : "+cars[2].color);
		
		cars[0].color = "��"; // 0�� �ε��� ��ü�� color�ʵ忡 black ����
		
		System.out.println("2�� �ε��� color : "+cars[2].color);
				
				
				
	}

}
