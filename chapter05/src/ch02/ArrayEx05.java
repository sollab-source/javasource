package ch02;

public class ArrayEx05 {
	public static void main(String[] args) {

		// 3x3 크기의 2차원 배열 선언 및 초기화
		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 배열 요소 출력
		// 행(row)의 개수
		for (int i = 0; i < numbers.length; i++) {

			// 열(column)의 개수
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println(); // 줄바꿈
		}
	}
}