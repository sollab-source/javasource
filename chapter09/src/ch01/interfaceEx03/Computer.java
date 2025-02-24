package ch01.interfaceEx03;

public class Computer implements Printer {

	@Override
	public void print() {
		System.out.println("컴퓨터 프린트 출력");
	}
}
