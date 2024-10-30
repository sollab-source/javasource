package ch03;

import java.util.Scanner;

public class ThrowsEx {
	// 숫자로 바꿔서 구구단 출력
	public void gugudan(String str) throws Exception {
		int num = Integer.parseInt(str);
		for (int i = 2; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}

	// 입력한 값에서 첫번째 자리만 잘라내기
	public void getNumber(String str) throws Exception {
		String s = str.substring(0, 1);// 0번째 문자부터 1번 앞까지 잘라낸 문자열
		gugudan(s);
	}

	// 스캐너로 구구단 숫자 입력(String)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ThrowsEx te = new ThrowsEx();

		System.out.print("구구단 숫자 입력 > ");
		String s = scanner.next();

		try {
			te.getNumber(s);
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요.");
		}

		System.out.println("program end");

	}

}
