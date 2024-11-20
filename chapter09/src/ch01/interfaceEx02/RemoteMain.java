package ch01.interfaceEx02;

public class RemoteMain {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.turnOn();
		tv.volumeUp(5);
		tv.volumeDown(3);
		tv.turnOff();
		System.out.println("========================");
		Radio radio = new Radio();
		radio.turnOn();
		radio.volumeUp(5);
		radio.volumeDown(3);
		radio.turnOff();
	}
}