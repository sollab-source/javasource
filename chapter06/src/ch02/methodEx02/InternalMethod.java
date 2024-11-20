package ch02.methodEx02;

public class InternalMethod {

	public InternalMethod() {
		System.out.println("생성자 호출");
		callInternalMethod01(1); // 생성자에서 내부 메소드 호출
	}

	public void method() {
		System.out.println("다른 메소드 호출");
		String str = callInternalMethod02(2); // 클래스 내부에서 다른 메소드 호출
		System.out.println(str);
	}

	public void callInternalMethod01(int num) {
		System.out.println(num + ".반환 값 없는 메소드 호출");
	}

	public String callInternalMethod02(int num) {
		return num + ".반환 값 있는 메소드 호출";
	}
}