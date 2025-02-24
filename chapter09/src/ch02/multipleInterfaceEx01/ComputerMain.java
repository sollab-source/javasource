package ch02.multipleInterfaceEx01;

public class ComputerMain {
	public static void main(String[] args) {
		Computer computer = new Computer();

		Mouse mouse = computer;
		mouse.click();

		Keyboard key = computer;
		key.toString();
	}
}