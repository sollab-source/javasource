package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationEx01 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sophia","Emma",
				"Olivia","Isabella","Mia");

		Stream<String> stream = list.stream();
		// 중간연산 sorted() 수행 후 최종연산 forEach() 실행
		stream.sorted().forEach(System.out::println);

		// 에러 발생 - 20번 행 수행 후 스트림은 이미 닫힘
		// stream.filter(s -> s.contains("m"))
		//					   .forEach(System.out::println);

		// 스트림 변환
		System.out.println("m or M 이 들어간 이름 출력");
		list.stream().filter(s -> s.toUpperCase()
								   .contains("M"))
								   .forEach(System.out::println);

		System.out.println();
		System.out.println("이름 길이가 5자 이상인 이름 출력");
		list.stream().filter(s -> s.length() >= 5)
			.forEach(System.out::println);

		int arr[] = { 39, 58, 88, 56, 77, 99, 23 };

		// 오름차순 정렬 후 출력
		System.out.println("오름차순 정렬 후 출력");
		Arrays.stream(arr).sorted()
			  .forEach((i) -> System.out.print(i + "\t"));

		System.out.println("\n");

		// 스트림 변환
		System.out.println("짝수 출력");
		Arrays.stream(arr).filter(i -> i % 2 == 0)
			  .forEach((i) -> System.out.print(i + "\t"));

		System.out.println("\n");

		System.out.println("2의 배수가 아니고,"
				+ " 3의 배수도 아닌 숫자 출력");
		Arrays.stream(arr)
			  .filter(i -> i % 2 != 0 && i % 3 != 0)
			  .forEach((i) -> System.out.print(i + "\t"));
	}
}