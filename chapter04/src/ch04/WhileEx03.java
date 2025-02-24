package ch04;

public class WhileEx03 {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		
		while (i <= 5) {
			sum += i;
			i++;
		}
		System.out.println("1부터 5까지의 합: " + sum);
	}
}