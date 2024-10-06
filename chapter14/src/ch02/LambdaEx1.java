package ch02;

@FunctionalInterface
interface MyFunction1 {
	int max(int a, int b);
}

public class LambdaEx1 {
	public static void main(String[] args) {
		
		MyFunction1 f = (a, b) -> a > b ? a : b;
		System.out.println("둘 중 큰 숫자는 ? "+f.max(12, 19));
	}
}
