package ch01.interfaceEx01;

public class PrinterMain {

	public static void main(String[] args) {

		Printer printer = new Computer();
		// 인터페이스로 선언한 참조변수에 구현클래스 대입

		printer.print();
		// 참조변수 printer로 구현클래스에서 재정의된 print() 메소드 호출
	}
}