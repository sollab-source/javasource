package ch01.interfaceEx03;

public class PrinterMain {

	public static void main(String[] args) {
		Printer printer = new Computer();

		printer.showStatus(60); // 현재 인쇄 페이지 수 전달
		System.out.println("================");
		printer.showStatus(120); // 최대 인쇄 페이지 수를 초과하는 경우
	}
}