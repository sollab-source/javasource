package ch02;

import java.util.function.Function;

public class FunctionEx01 {
	public static void main(String[] args) {
		// String 인자를 받아 Integer 로 반환
		Function<String, Integer> function1 = t -> Integer.parseInt(t);
		// 위 코드는 아래 코드로 대체 가능
		// Function<String, Integer> function1 = Integer::parseInt;
		System.out.println("문자 숫자를 숫자로 변환 "+function1.apply("21"));
		
		// 일의 자리를 제거하는 함수 구현
		Function<Integer, Integer> function2 = i -> i / 10 * 10;
		System.out.println("일의 자리 제거 "+function2.apply(789));
	}
}
