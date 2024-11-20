package ch01;

public class ArrayEx04 {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 1, 15, 7 };
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("배열의 최댓값: " + max);
	}
}