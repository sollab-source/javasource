package ch01.interfaceEx02;

public interface Remote {

	int MAX_VALUME = 100;
	int MIN_VALUME = 0;

	void turnOn();

	void turnOff();

	void volumeUp(int volume);

	void volumeDown(int volume);
}