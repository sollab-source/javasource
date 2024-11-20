package ch01;

import java.util.Scanner;

public class OperatorEx03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 첫 번째 숫자 입력
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int num1 = scanner.nextInt();

		// 두 번째 숫자 입력
		System.out.print("두 번째 숫자를 입력하세요: ");
		int num2 = scanner.nextInt();

		// 연산 결과 출력
		System.out.println("두 수의 합: " + (num1 + num2));
		System.out.println("두 수의 차: " + (num1 - num2));
		System.out.println("두 수의 곱: " + (num1 * num2));
		System.out.println("두 수의 몫: " + (num1 / num2));
		System.out.println("두 수의 나머지: " + (num1 % num2));

		scanner.close();
	}
}