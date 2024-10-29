package quiz;

import java.util.Scanner;

public class Test01 {

	   public static void main(String[] args) {
		   
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("첫 번째 숫자를 입력하세요: ");
	        int num1 = scanner.nextInt();
	        System.out.print("두 번째 숫자를 입력하세요: ");
	        int num2 = scanner.nextInt();

	        System.out.println("나머지: " + (num1 % num2));
	        
	        scanner.close();
	   }
}


