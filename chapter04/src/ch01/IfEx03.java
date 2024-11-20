package ch01;

public class IfEx03 {

	public static void main(String[] args) {

		int score = 85;

		if (score >= 90) {
			System.out.println("A 학점입니다.");
		} else if (score >= 80) {
			System.out.println("B 학점입니다.");
		} else {
			System.out.println("C 학점입니다.");
		}
	}
}