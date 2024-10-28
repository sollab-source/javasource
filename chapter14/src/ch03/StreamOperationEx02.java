package ch03;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationEx02 {

	public static void main(String[] args) {
		
		Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"),
				new File("Ex2"), new File("Ex2.bak"), new File("Test.java"));
		
		// 파일의 확장자 추출 후 중복 제거 후 이름 출력하기
		stream.map(File::getName)   // 파일 이름 모으기
			  .filter(f -> f.indexOf(".") > -1) // 이름에서 확장자가 있는 파일만 추출
			  .map(f -> f.substring(f.lastIndexOf(".")+1)) // 확장자만 모으기
			  .distinct() // 중복 제거
			  .forEach(System.out::println); // 스트림 요소 출력		
		
		System.out.println();
		
		List<String> list = Arrays.asList("Reflection", "Collection", "Stream", "Structure", "State", "Flow", "Sorting",
				"Mapping", "Reduction", "Stream");

		// 중간결과 저장
		Set<String> intermediateResults = new HashSet<>();

		// stream 으로 변환 후 중간 연산 후 최종연산
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
				// 새로운 리스트로 생성(최종연산)
				.collect(Collectors.toList()); 

		// 중간 연산 결과 출력
		System.out.println("Intermediate Results:");
		intermediateResults.forEach((i) -> System.out.print(i+"\t"));
		
		System.out.println("\n");

		// 최종 연산 결과 출력
		System.out.println("Final Result:");
		result.forEach((i) -> System.out.print(i+"\t"));
	}
}
