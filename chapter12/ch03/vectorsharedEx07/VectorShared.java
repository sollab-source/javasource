package chapter13.ch03.vectorsharedEx07;

import java.util.Vector;

public class VectorShared {

	// Vector 객체 선언(공유 자원)
	private Vector<Integer> sharedVector = new Vector<Integer>();

	// Vector에 데이터를 추가하는 메서드
	public void addDataToVector(int count) {
		for (int i = 0; i < count; i++) {
			sharedVector.add(i);
			System.out.println("스레드 " + Thread.currentThread().getName() + "이(가) 데이터 " + i + " 추가");
			try {
				Thread.sleep(50); // 각 데이터 추가 후 잠시 대기 (멀티스레드 상황 시뮬레이션)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}// addDataToVector

	public void printVector() {
		System.out.println("현재 Vector의 데이터: " + sharedVector);
	}

}
