package ch03;

import java.util.Arrays;
import java.util.stream.Stream;

public class FromArrayEx1 {
	public static void main(String[] args) {
		String strArr[] = {"홍길동","성춘향","이철수","김영희","홍민호"};
		// 배열을 스트림으로 변환
		Stream<String> stream = Arrays.stream(strArr);
		// 스트림에서 요소 출력
		stream.forEach(System.out::println);
	}
}
