package ch01;

public class ArrayEx02 {

	public static void main(String[] args) {

		// 정수형 배열 A를 선언하고 크기를 3으로 초기화
		int[] A = new int[3];

		// 배열 A에 값 할당

		// 첫 번째 요소에 10 저장
		A[0] = 10;

		// 두 번째 요소에 20 저장
		A[1] = 20;

		// 세 번째 요소에 30 저장
		A[2] = 30;

		// 배열 A의 요소 출력
		for (int i = 0; i < A.length; i++) {
			System.out.println("A[" + i + "] = " + A[i]);
		}
	}
}