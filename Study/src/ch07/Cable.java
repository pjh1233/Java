package ch07;

public class Cable implements Socket{
	
	private Bulb bulb;
	


	@Override
	public void switchOn() {
		bulb.lightOn();
		
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
		
	}
	

}
