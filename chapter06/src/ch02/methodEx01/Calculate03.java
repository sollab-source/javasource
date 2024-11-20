package ch02.methodEx01;

public class Calculate03 {

	public void divide(double num1, double num2) {

		if (num2 == 0) {
			System.out.println("0으로는 나눌 수가 없습니다.");
			return;// 메소드 강제 종료
		} else {
			double result = num1 / num2;
			System.out.println(result);
		}
	}
}