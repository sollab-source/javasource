package ch02.methodEx03;

public class CalculateMain {

	public static void main(String[] args) {

		Calculate calculate = new Calculate();

		int num1 = 1;
		int num2 = 2;

		int result = calculate.add(num1, num2);

		System.out.println(result);
	}
}