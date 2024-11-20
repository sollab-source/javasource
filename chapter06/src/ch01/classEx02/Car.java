package ch01.classEx02;

public class Car {

	// 멤버변수
	int license;// 멤버변수에 초기값 생략
	String name = "소나타";// 멤버변수에 초기값 지정

	// 생성자
	public Car() {

		// 생성자에서 멤버변수 license 초기화
		license = 12345;

		// 생성자에서 선언된 지역변수
		String message = "차량생산";

		// 생성자에서 멤버변수 name 읽기
		System.out.println(name + message);
	}

	// 메소드
	public void move() {

		// 생성자에서 선언된 지역변수
		String message = "차량이 달립니다.";

		// 생성자에서 멤버변수 name 읽기
		System.out.println(name + message);
	}
}