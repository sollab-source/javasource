package ch05;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDifferenceEx05 {

	public static void main(String[] args) {

		// HashMap 객체 생성 및 데이터 추가
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("apple", "red");
		hashMap.put("banana", "yellow");
		hashMap.put("grape", "purple");
		hashMap.put("orange", "orange");

		// LinkedHashMap 객체 생성 및 데이터 추가
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("apple", "red");
		linkedHashMap.put("banana", "yellow");
		linkedHashMap.put("grape", "purple");
		linkedHashMap.put("orange", "orange");

		// HashMap 출력 (순서 보장되지 않음)
		System.out.println("\n== HashMap 출력 (순서 무작위) ==");
		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// LinkedHashMap 출력 (입력 순서 보장)
		System.out.println("\n== LinkedHashMap 출력 (입력된 순서) ==");
		for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}