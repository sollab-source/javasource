package chapter13.ch02;

import java.util.HashSet;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		// Set:중복불허
		// HashSet 생성 : 중복불허 + 순서 없음
		Set<String> fruits = new HashSet<String>();

		// 과일 추가
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Apple");// 중복 추가

		// 과일 목록 출력
		System.out.println("Fruits in the set");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// 특정 과일 제거
		fruits.remove("Banana");

		// 수정된 과일 목록 출력
		System.out.println("\nAfter removing Banana:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
