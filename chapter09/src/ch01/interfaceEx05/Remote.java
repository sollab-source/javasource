package ch01.interfaceEx05;

public interface Remote {

	// 상수 멤버 변수
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;

	// 추상 메소드
	void powerOn();

	void powerOff();

	// private 메소드: 중복 코드 처리
	private void showVolumeRange() {
		System.out.println("볼륨 범위는 " + MIN_VOLUME + "에서 "
				+ MAX_VOLUME + " 사이입니다.");
	}

	// 디폴트 메소드
	default void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
			System.out.println("볼륨 설정값이 범위를 초과했습니다.");
			showVolumeRange();// private 메소드 호출
		} else {
			System.out.println("볼륨을 " + volume + "으로 설정합니다.");
		}
	}

	// 또 다른 디폴트 메소드
	default void mute() {
		System.out.println("음소거 상태로 전환합니다.");
		showVolumeRange();// private 메소드 호출
	}
}
