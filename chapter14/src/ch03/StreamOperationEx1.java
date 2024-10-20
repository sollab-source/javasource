package ch03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationEx1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Sophia");
		list.add("Emma");
		list.add("Olivia");
		list.add("Isabella");
		list.add("Mia");
		
		Stream<String> stream = list.stream();
		// 중간연산 sorted() 수행 후 최종연산 forEach() 실행
		stream.sorted().forEach(System.out::println);
		
		//에러 발생 - 20번 행 수행 후 스트림은 이미 닫힘
		//stream.filter(s -> s.contains("m")).forEach(System.out::println);
				
		// 스트림 변환
		System.out.println("m or M 이 들어간 이름 출력");
		list.stream().filter(s -> s.toUpperCase().contains("M")).forEach(System.out::println);
		
		System.out.println();
		System.out.println("이름 길이가 5자 이상인 이름 출력");
		list.stream().filter(s -> s.length() >= 5).forEach(System.out::println);		
	}
}
