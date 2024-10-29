package ch10.other;

public class RandomEx1 {
	public static void main(String[] args) {
		// 0 ~ 9 범위에서 정수형 랜덤값 구하기
		int r1 = (int) (Math.random() * 10);
		// 실행시마다 출력되는 값은 다르게 나올 수 있다.
		System.out.println(" 0 ~ 9 범위에서 정수형 랜덤값 : " + r1);
		// 1 ~ 10 범위에서 정수형 랜덤값 구하기
		int r2 = (int) (Math.random() * 10) + 1;
		// 실행시마다 출력되는 값은 다르게 나올 수 있다.
		System.out.println(" 1 ~ 10 범위에서 정수형 랜덤값 : " + r2);
	}
}
