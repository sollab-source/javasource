package ch04;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx04 {

	public static void main(String[] args) {

		Set<String> linkedHashSet = new LinkedHashSet<String>();

		// 요소 추가
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");

		// 중복이 허용되지 않음
		linkedHashSet.add("Apple");

		// 출력
		System.out.println("linkedHashSet: " + linkedHashSet);

		// 요소 존재 여부 확인
		if (linkedHashSet.contains("Banana")) {
			System.out.println("Banana is in the linkedHashSet");
		}

		// 요소 삭제
		linkedHashSet.remove("Orange");
		System.out.println("After removal: " + linkedHashSet);

	}
}