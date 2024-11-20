package ch02.methodEx02;

public class ExternalMethodMain {

	public static void main(String[] args) {

		ExternalMethod exMethod = new ExternalMethod();
		// 객체 생성
		exMethod.callExternalMethod01(1, "외부 클래스");

		String str = exMethod.callExternalMethod02(2, "외부 클래스");
		System.out.println(str);
	}
}