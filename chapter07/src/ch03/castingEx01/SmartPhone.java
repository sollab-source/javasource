package ch03.castingEx01;

public class SmartPhone extends Phone {
	// 부모의 메소드 재정의
	@Override
	public void call() {
		System.out.println("스마트폰으로 전화를 겁니다.");
	}

	// 자식의 메소드
	public void videoCall() {
		System.out.println("스마트폰으로 영상통화를 합니다.");
	}
}
