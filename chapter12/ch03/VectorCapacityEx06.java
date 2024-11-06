package chapter13.ch03;

import java.util.Vector;

public class VectorCapacityEx06 {

	public static void main(String[] args) {

		// Vector 생성 (기본 용량 10)
		Vector<String> vector = new Vector<String>();

		// 현재 크기와 용량 출력
		System.out.println("초기 크기: " + vector.size());
		System.out.println("초기 용량: " + vector.capacity());

		// 데이터 추가
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Cherry");

		// 데이터 추가 후 크기와 용량 출력
		System.out.println("3개의 데이터 추가 후 크기: " + vector.size());
		System.out.println("3개의 데이터 추가 후 용량: " + vector.capacity());

		// 10개의 데이터를 추가하여 벡터 용량이 넘어가도록 구현
		for (int i = 0; i < 8; i++) {
			vector.add("Fruit" + i);
		}

		// 데이터 추가 후 크기와 용량 출력
		System.out.println("11개의 데이터 추가 후 크기: " + vector.size());
		System.out.println("11개의 데이터 추가 후 용량: " + vector.capacity());
	}
}
