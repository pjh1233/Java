package ch07;

/*
 * 날짜 : 2022 01 06
 * 이름 : 박준혁
 * 내용 : 자바 인터페이스 실습 교재 p228
 */
public class InterfaceTest{
	
	public static void main(String[] args) {
		
		//인터페이스로 공통 클래스 구조 설계
		RemoteControl lg = new RemoteLg();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.powerOff();
		lg.chUp();
		lg.chDown();
		lg.soundUp();
		lg.soundDown();
		
		samsung.powerOn();
		samsung.powerOff();
		samsung.chUp();
		samsung.chDown();
		samsung.soundUp();
		samsung.soundDown();
		
		//인터페이스를 이용한 결합도 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable();
		
		socket.switchOn();
		socket.switchOff();
		
		
	}
}