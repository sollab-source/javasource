package ch02;

@FunctionalInterface
interface MyFunctionInterface1 {
	int max(int a, int b);
}

public class LambdaEx01 {
	public static void main(String[] args) {
		// 테스트
		MyFunctionInterface1 f = (a, b) -> a > b ? a : b;
		System.out.println("둘 중 큰 숫자는 ? "+f.max(12, 19));
	}
}
