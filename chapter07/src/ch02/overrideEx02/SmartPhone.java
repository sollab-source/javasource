package ch02.overrideEx02;

public class SmartPhone extends Phone {

	boolean videoCall = false;

	@Override
	public void call() {
		if (videoCall == false) {
			// 부모 클래스의 일반 전화 기능 호출
			super.call();
		} else {
			System.out.println("휴대폰으로 화상전화를 겁니다.");
		}
	}
}