package ch02;

import java.util.function.Consumer;

public class ConsumerEx {
	public static void main(String[] args) {
		// 인자를 받아 메소드 안에서 사용하는 형태
		Consumer<String> consumer = t -> System.out.println(t + "21");
		consumer.accept("java");
	}
}
