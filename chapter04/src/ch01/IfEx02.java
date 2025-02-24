package ch01;

public class IfEx02 {

	public static void main(String[] args) {

		// 변수 초기화
		int age = 16;

		// age에 담긴 값이 18보다 크거나 같다면(조건)
		if (age >= 18) {
			System.out.println("성인입니다.");
		// 그렇지 않다면
		} else {
			System.out.println("미성년자입니다.");
		}
	}
}