package ch03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDifferentEx05 {

	public static void main(String[] args) {

		// ArrayList와 LinkedList 두 리스트를 생성한다.
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();

		long startTime;
		long endTime;

		// ArrayList에 데이터 추가 성능 테스트
		System.out.println("== ArrayList 성능 테스트 시작 ==");
		startTime = System.nanoTime(); // 시작 시간 측정

		// ArrayList의 맨 앞에 10,000개의 데이터를 삽입한다.
		for (int i = 0; i < 10000; i++) {
			arrayList.add(0, String.valueOf(i));
		}

		endTime = System.nanoTime(); // 끝나는 시간 측정
		System.out.println("ArrayList 걸린 시간: " + (endTime - startTime) + " ns");

		System.out.println("-----------------------------");

		// LinkedList에 데이터 추가 성능 테스트
		System.out.println("== LinkedList 성능 테스트 시작 ==");
		startTime = System.nanoTime(); // 시작 시간 측정

		// LinkedList의 맨 앞에 10,000개의 데이터를 삽입한다.
		for (int i = 0; i < 10000; i++) {
			linkedList.add(0, String.valueOf(i));
		}

		endTime = System.nanoTime(); // 끝나는 시간 측정
		System.out.println("LinkedList 걸린 시간: " + (endTime - startTime) + " ns");
	}
}