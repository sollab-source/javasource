package ch03.vectorsharedEx07;

public class VectorSharedMain {

	public static void main(String[] args) {

		// VectorExample 객체 생성
		VectorShared vectorExample = new VectorShared();

		// 첫 번째 스레드
		Thread thread1 = new Thread(() -> {
			vectorExample.addDataToVector(5); // 첫 번째 스레드에서 5개의 데이터 추가
		}, "1");

		// 두 번째 스레드
		Thread thread2 = new Thread(() -> {
			vectorExample.addDataToVector(5); // 두 번째 스레드에서 5개의 데이터 추가
		}, "2");

		// 멀티 스레스 실행
		thread1.start();
		thread2.start();

		// 두 스레드가 끝날 때까지 대기
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 출력
		vectorExample.printVector();
	}
}