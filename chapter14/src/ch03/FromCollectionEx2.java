package ch03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionEx2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Sophia");
		list.add("Emma");
		list.add("Olivia");
		list.add("Isabella");
		list.add("Mia");
		
		// 중간연산 sorted() 수행 후 최종연산 forEach() 실행
		list.stream().sorted().forEach(System.out::println);
		
		// 스트림 변환
		Stream<String> stream = list.stream();
		stream.forEach(System.out::println);
	}

}
