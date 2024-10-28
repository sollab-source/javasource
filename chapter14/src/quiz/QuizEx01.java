package quiz;

@FunctionalInterface
interface Calc {
	int minus(int x, int y);
}

public class QuizEx01 {
	public static void main(String[] args) {		
		Calc f = (x, y) -> x - y;
		System.out.println("두 수의 차 ? "+f.minus(12,5));
	}
}
