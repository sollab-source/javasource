package ch02;

import java.util.function.Predicate;

public class PredicateEx01 {
	public static void main(String[] args) {
		// 인자를 받아 특정 조건 만족 여부
		Predicate<Integer> predicate1 = i -> i > 10;
		System.out.println("매개 변수는 10보다 크다 " + predicate1.test(5));

		Predicate<String> predicate2 = str -> str.isEmpty();
		System.out.println("빈 문자열 여부 " + predicate2.test("함수적 인터페이스"));
	}
}
