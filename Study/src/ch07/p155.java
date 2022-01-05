package ch07;

public class p155 {
	
	public static void mani(String[] args) {
		
		Return obj = new Return();
		
		String name = obj.getName();
		int age = obj.getAge();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(obj.getName);
		System.out.println(obj.getAge);
		
	}

}


class Return {
	
	String getName() {
		return "ȫ�浿";
	}
	
	int Age() {
		return 30;
	}
}
