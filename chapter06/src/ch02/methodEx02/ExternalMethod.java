package ch02.methodEx02;

public class ExternalMethod {

	public void callExternalMethod01(int num, String str) {
		System.out.println(num + "." + str + "에서 호출되는 메소드");
	}

	public String callExternalMethod02(int num, String str) {
		return num + "." + str + "에서 호출되는 메소드";
	}
}