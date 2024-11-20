package ch01.interfaceEx05;

public class RemoteMain {

	public static void main(String[] args) {

		Remote speaker = new Speaker();

		speaker.powerOn();

		System.out.println("볼륨 설정 테스트:");
		speaker.setVolume(120); // 볼륨이 범위를 초과하는 경우
		speaker.setVolume(70); // 유효한 볼륨 설정

		System.out.println("음소거 기능 테스트:");
		speaker.mute(); // 음소거 상태 전환

		speaker.powerOff();
	}
}