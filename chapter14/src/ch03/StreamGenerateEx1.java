package ch03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerateEx1 {
	public static void main(String[] args) {
		
		String strArr[] = {"홍길동","성춘향","이철수","김영희","홍민호"};
		// 배열에서 스트림 얻기		
		Stream<String> stream = Arrays.stream(strArr);		
		stream.forEach(System.out::println);
		
		System.out.println();
		
		List<String> list = Arrays.asList("사과","바나나","포도","딸기","메론");
		// 컬렉션에서 스트림 얻기
		Stream<String> stream2 = list.stream();		
		stream2.forEach(System.out::println);
		
		System.out.println();
		
		// 스트림으로 바로 생성하기
		Stream <String> stream3 = Stream.of("해바라기","장미","국화","수선화","튤립");
		stream3.forEach(System.out::println);
		
		System.out.println();
		
		// 특정 범위의 정수
		IntStream intStream1 = IntStream.rangeClosed(1, 5);
		intStream1.forEach(System.out::print);
		System.out.println();
		IntStream intStream2 =IntStream.range(1, 5);
		intStream2.forEach(System.out::print);
	}	
}
