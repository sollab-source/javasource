package chapter13.ch04;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx05 {

	public static void main(String[] args) {

		Set<String> treeSet = new TreeSet<>();

		// 요소 추가
		treeSet.add("Orange");
		treeSet.add("Banana");
		treeSet.add("Apple");

		// 중복이 허용되지 않음
		treeSet.add("Apple");

		// 출력
		System.out.println("treeSet: " + treeSet);

		// 요소 존재 여부 확인
		if (treeSet.contains("Banana")) {
			System.out.println("Banana is in the treeSet");
		}

		// 요소 삭제
		treeSet.remove("Orange");
		System.out.println("After removal: " + treeSet);

	}
}
