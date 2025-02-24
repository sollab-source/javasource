package ch01;

public class IfEx04 {

	public static void main(String[] args) {

		int x = 5;

		if (x > 0) {
			System.out.println("양수입니다.");
		} else if (x < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
	}
}