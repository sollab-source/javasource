package ch02.overrideEx02;

public class OverrideMain {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();

		// 일반적인 전화기능(부모의 call 메소드 호출)
		sp.call();
		sp.videoCall = true;

		// 화상 전화기능(자식의 재정의된 call 메소드 호출)
		sp.call();
	}
}