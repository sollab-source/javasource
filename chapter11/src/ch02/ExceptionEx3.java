package ch02;

public class ExceptionEx3 {

	public static void main(String[] args) {
		int var = 50;
		int data = 0;
		try {
			data = Integer.parseInt(args[0]);
			System.out.println(var / data);
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("값을 입력하세요.");
		} catch (NumberFormatException | ArithmeticException nae) {
			System.out.println("0이 아닌 숫자만 입력하세요.");
		} catch (Exception e) {
			System.out.println("예외 처리");
		}
		System.out.println("program end");
	}
}
