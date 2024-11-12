
 package ch02;

 import java.util.Scanner;

 public class AverageCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;

		System.out.println("숫자를 입력하세요 (종료하려면 -1 입력): ");
		while (true) {
			int num = scanner.nextInt();
			if (num == -1) {
				break; // -1 입력 시 종료
			}
			sum += num;
			count++;
		}
		if (count > 0) {
			double average = (double) sum / count;
			System.out.println("입력한 숫자의 평균은: " + Math.round(average));
		} else {
			System.out.println("숫자가 입력되지 않았습니다.");
		}
		scanner.close();
	 }
 }
 
 

 