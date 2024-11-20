package ch03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFeatureEx01 {
	public static void main(String[] args) {

		// 배열과 컬렉션의 소스를 정렬 후 출력

		// 배열
		String[] strArr = { "apple", "lemon", "banana" };
		// 리스트
		List<String> strList = Arrays.asList(strArr);

		// 스트림 적용 전 (원본 정렬됨)
		System.out.println("*** 스트림 적용 전 ***");
		Arrays.sort(strArr);
		Collections.sort(strList);

		for (String s : strArr) {
			System.out.print(s + "\t");
		}
		System.out.println();

		for (String s : strList) {
			System.out.print(s + "\t");
		}

		System.out.println("\n");

		// 스트림 적용 후
		String[] strArr2 = { "apple", "lemon", "banana" };
		List<String> strList2 = Arrays.asList(strArr2);

		System.out.println("*** 스트림 적용 후 ***");
		// 배열 오름차순 정렬 후 출력
		Arrays.stream(strArr2).sorted().forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		System.out.println("정렬 후 원본 확인 " + Arrays.toString(strArr2));

		// List 내림차순 정렬 후 출력
		strList2.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		System.out.println("정렬 후 원본 확인 " + strList2);

		System.out.println();

		// 스트림 재사용 불가
		IntStream intStream1 = IntStream.rangeClosed(1, 5);
		intStream1.forEach(System.out::print);
		System.out.println();
		// 에러발생 : stream has already been operated upon or closed
		long count = intStream1.count();
	}
}