package ch02;

@FunctionalInterface
interface MyFunction3 {
	int minus(int x, int y);
}

public class LambdaEx3 {
	public static void main(String[] args) {
		
		MyFunction3 f = (x, y) -> x - y;
		System.out.println("두 수의 차 ? "+f.minus(12,5));
	}
}
