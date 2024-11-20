package ch04.staticEx02;

public class StaticTest {

	static int staticNum;// 정적변수
	int instanceNum;// 멤버변수

	// 인스턴스 메소드
	public void instanceMethod() {
		System.out.println("인스턴스 메소드 호출");
	}

	// 정적메소드
	public static void staticMethod01() {
		System.out.println("정적메소드 호출");
	}

	// 정적메소드
	public static void staticMethod02() {
		// 정적메소드는 정적멤버에 접근가능
		staticNum = 1;
		staticMethod01();

		/*
		 정적메소드는 인스턴스 멤버에 인스턴스 생성 없이 접근 불가능 
		 instanceNum = 2; 
		 instanceMethod();
		 */

		// 정적메소드는 인스턴스 생성 후 접근가능
		StaticTest st = new StaticTest();
		st.instanceNum = 2;
		st.instanceMethod();
	}
}