package ch03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperationEx3 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Reflection", "Collection", "Stream", "Structure", "State", "Flow", "Sorting",
				"Mapping", "Reduction", "Stream");

		// Create a set to hold intermediate results
		Set<String> intermediateResults = new HashSet<>();

		// Stream pipeline demonstrating various intermediate operations
		List<String> result = list.stream()
				// 대문자 "S" 로 시작하는 문자열 추출
				.filter(s -> s.startsWith("S")) 
				// 추출된 결과의 문자열을 모두 대문자로 변경
				.map(String::toUpperCase)
				// 중복 요소 제거
				.distinct()
				// 요소 정렬
				.sorted()
				// 이전 작업까지 진행된 스트림 중간연산저장 리스트에 추가
				.peek(s -> intermediateResults.add(s))
				// 새로운 리스트로 생성
				.collect(Collectors.toList()); 

		// 중간 연산 결과 출력
		System.out.println("Intermediate Results:");
		intermediateResults.forEach(System.out::println);
		
		System.out.println();

		// 최종 연산 결과 출력
		System.out.println("Final Result:");
		result.forEach(System.out::println);

	}
}
