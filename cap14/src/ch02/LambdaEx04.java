package ch02;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class LambdaEx04 {
	public static void main(String[] args) {
		// 두 개의 인자를 받아서 합 리턴
		BiFunction<Integer, Integer, Integer> f1 = (x, y) -> x + y;
		System.out.println("15와 24 의 합은 ? " + f1.apply(15, 24));

		// 두 개의 String 을 인자로 받아 하나의 문자열로 리턴
		BiFunction<String, String, String> f2 = (s1, s2) -> s1.concat(s2);
		System.out.println(f2.apply("람다", "식"));

		// 두 개의 인자를 받아서 큰 수 출력
		BiConsumer<Integer, Integer> c1 = (x, y) -> System.out.println(x > y ? x : y);
		System.out.print("10와 9 중 큰 수는 ? ");
		c1.accept(10, 9);

		// 인자로 받은 문자열과 숫자가 동일한지 판별
		BiPredicate<String, Integer> p1 = (x, y) -> x.length() == y;
		System.out.println("pineapple 은 5자이다 : " + p1.test("pineapple", 5));
		System.out.println("apple은 5자이다 : " + p1.test("apple", 5));
	}
}
