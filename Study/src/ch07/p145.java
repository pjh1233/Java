package ch07;

public class p145 {
	
	public static void main(String [] args) {
		
		//Car 타입의 배열객체 생성
		Car[] cars = new Car[3];
		
		//Car 객체 생성
		Car tico = new Car();
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";
		
		//모든 인덱스에 tico저장
		for (int i=0; i<cars.length; i++) {
			cars[i] = tico;
		}
		
		System.out.println("2번 인덱스 color : "+cars[2].color);
		
		cars[0].color = "블랙"; // 0번 인덱스 객체의 color필드에 black 대입
		
		System.out.println("2번 인덱스 color : "+cars[2].color);
				
				
				
	}

}
