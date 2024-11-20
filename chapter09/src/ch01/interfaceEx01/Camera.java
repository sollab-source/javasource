package ch01.interfaceEx01;

public class Camera implements Printer {

	@Override
	public void print() {
		System.out.println("카메라 프린트 출력");
	}
}