package ch03;

public class ForEx03 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				// i가 3일 때 현재 순회 중단
				continue; 
			}
			System.out.println(i);
		}
	}
}

