package ch04;

public class WhileEx02 {

	public static void main(String[] args) {

		int count = 1;

		// do 블록 안에 있는 코드는 조건을 검사하기 전에 한 번은 무조건 실행
		do {
			System.out.println("카운트: " + count);
			count++;
			// while 조건을 검사하여 count가 5 이하일 경우 계속 반복
		} while (count <= 5);

		System.out.println("루프 종료");
	}
}