package quiz;

public class Test02 {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();

		// 화상전화 모드로 설정
		smartPhone.setVideoCall(true);
		smartPhone.call(); // 화상전화를 겁니다.

		// 일반전화 모드로 설정
		smartPhone.setVideoCall(false);
		smartPhone.call(); // 일반 전화를 겁니다.
	}
}