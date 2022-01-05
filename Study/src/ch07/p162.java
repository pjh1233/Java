package ch07;

public class p162 {
	
	public static void main(String[] args) {
		
		Operate op = new Operate();
		
		System.out.println(op.multifly(4, 3));
		
	}

}

class Operate{
	
	int multifly (int x, int y) {
		return x * y;		
	}
}