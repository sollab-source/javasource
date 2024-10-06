package ch02;

@FunctionalInterface
interface MyFunction2 {
	int square(int x);
}

public class LambdaEx2 {
	public static void main(String[] args) {
		
		MyFunction2 f = (x) -> x * x;
		System.out.println("제곱 ? "+f.square(12));
	}
}
