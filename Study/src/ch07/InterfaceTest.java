package ch07;

/*
 * ��¥ : 2022 01 06
 * �̸� : ������
 * ���� : �ڹ� �������̽� �ǽ� ���� p228
 */
public class InterfaceTest{
	
	public static void main(String[] args) {
		
		//�������̽��� ���� Ŭ���� ���� ����
		RemoteControl lg = new RemoteLg();
		RemoteControl samsung = new Samsung();
		
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
		
		//�������̽��� �̿��� ���յ� ��ȭ
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		
	}
}