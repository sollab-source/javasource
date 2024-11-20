package quiz;

public abstract class Person {
	// 템플릿 메소드
	public void dailyRoutine() {
		wakeUp();
		doActivity(); // 추상 메소드 호출
		sleep();
	}

	// 공통 메소드
	public void wakeUp() {
		System.out.println("아침에 일어납니다.");
	}

	public void sleep() {
		System.out.println("밤에 잡니다.");
	}

	// 추상 메소드
	public abstract void doActivity();
}