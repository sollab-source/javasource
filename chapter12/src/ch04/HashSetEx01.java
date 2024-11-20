package ch04;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<String>();

		// 요소 추가
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");

		// 중복이 허용되지 않음
		hashSet.add("Apple");

		// 출력
		System.out.println("HashSet: " + hashSet);

		// 요소 존재 여부 확인
		if (hashSet.contains("Banana")) {
			System.out.println("Banana is in the HashSet");
		}

		// 요소 삭제
		hashSet.remove("Orange");
		System.out.println("After removal: " + hashSet);
	}
}