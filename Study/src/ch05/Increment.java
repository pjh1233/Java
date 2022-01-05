package ch05;

public class Increment {
	
	public int num1;
	public static int num2;
	
	public Increment() {
		
		num1++;
		num2++;
		
		System.out.println("Incremnet num1 : "+num1);
		System.out.println("Incremnet num2 : "+num2);
	}
	
	//정적 메서드에서는 non-static변수 참조 불가
	public void add() {
		num1++;
		num2++;
	}

}
