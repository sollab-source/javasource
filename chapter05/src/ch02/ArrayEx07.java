package ch02;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		// 학생 수
		int numStudents = 5;

		// 학생 점수를 저장할 배열
		int[] scores = new int[numStudents];

		// Scanner 객체를 사용해 사용자 입력 받기
		Scanner scanner = new Scanner(System.in);

		// 점수 입력 받기
		System.out.println("학생들의 점수를 입력하세요.");
		for (int i = 0; i < numStudents; i++) {
			System.out.print((i + 1) + "번째 학생의 점수: ");
			scores[i] = scanner.nextInt();
		}

		// 점수 합계 계산
		int sum = 0;
		for (int i = 0; i < numStudents; i++) {
			sum += scores[i];
		}

		// 평균 계산
		double average = (double) sum / numStudents;

		// 결과 출력
		System.out.println("\n입력한 학생들의 점수:");
		for (int i = 0; i < numStudents; i++) {
			System.out.println((i + 1) + "번째 학생의 점수: " + scores[i]);
		}

		System.out.println("평균 점수: " + average);

		scanner.close();
	}
}