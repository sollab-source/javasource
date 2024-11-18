package quiz;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단 몇 단을 출력할까요? ");

		int n = scanner.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}