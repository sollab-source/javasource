package ch03;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperationEx03 {

	public static void main(String[] args) {
		int arr[] = { 39, 58, 88, 56, 77, 99, 23 };

		System.out.println("기본형 스트림에 존재하는 통계 메서드");
		System.out.println("배열 합 " + Arrays.stream(arr).sum());
		System.out.println("배열 평균 " + Arrays.stream(arr).average());
		System.out.println("배열 최대값 " + Arrays.stream(arr).max());
		System.out.println("배열 최소값 " + Arrays.stream(arr).min());
		System.out.println("배열 요소 개수 " + Arrays.stream(arr).count());
	}
}