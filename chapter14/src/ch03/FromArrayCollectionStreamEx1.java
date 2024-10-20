package ch03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromArrayCollectionStreamEx1 {
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
	}	
}
