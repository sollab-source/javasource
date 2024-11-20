package ch02;

import java.util.function.Consumer;

public class ConsumerEx01 {
	public static void main(String[] args) {
		// 인자를 받아 메소드 안에서 사용하는 형태
		Consumer<String> consumer = t -> System.out.println(t + "21");
		consumer.accept("java");

		Consumer<Integer> consumer2 = t -> System.out.println("임의의 수 " + t);
		consumer2.accept((int) (Math.random() * 6));
	}
}