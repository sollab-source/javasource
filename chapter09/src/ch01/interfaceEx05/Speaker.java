package ch01.interfaceEx05;

public class Speaker implements Remote {
	@Override
	public void powerOn() {
		System.out.println("스피커 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("스피커 전원을 끕니다.");
	}
}