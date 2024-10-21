package quiz;

@FunctionalInterface
interface MyFunction2 {
	int square(int x);
}

public class QuizEx2 {		
	public static void main(String[] args) {		
		MyFunction2 f = (x) -> x * x;
		System.out.println("12 제곱 ? "+f.square(12));
	}
}
