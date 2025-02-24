package ch03.castingEx01;

public class CastingMain {

	public static void main(String[] args) {
		// 부모로 선언한 자식 객체
		SmartPhone smartPhone = new SmartPhone();
		Phone phone = smartPhone;

		// 재정의된 메소드 호출
		phone.call();

		// 자식의 메소드 호출 불가
		// phone.videoCall();
	}
}