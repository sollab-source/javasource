package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperationEx2 {

	public static void main(String[] args) {
		int arr[] = {39,58,88,56,77,99,23};
		
			
		// 오름차순 정렬 후 출력
		System.out.println("오름차순 정렬 후 출력");
		Arrays.stream(arr).sorted().forEach(System.out::println);
					
		System.out.println();
		
		// 스트림 변환		
		System.out.println("짝수 출력");
		Arrays.stream(arr).filter(i -> i % 2 == 0).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("2의 배수가 아니고, 3의 배수도 아닌 숫자 출력");
		Arrays.stream(arr).filter(i -> i % 2 != 0 && i % 3 != 0).forEach(System.out::println);	
	
		System.out.println("기본형 스트림에 존재하는 통계 메서드");
		System.out.println("배열 합 " + Arrays.stream(arr).sum());
		System.out.println("배열 평균 " + Arrays.stream(arr).average());
		System.out.println("배열 최대값 " + Arrays.stream(arr).max());
		System.out.println("배열 최소값 " + Arrays.stream(arr).min());
		System.out.println("배열 요소 개수 " + Arrays.stream(arr).count());
			
	}
}
