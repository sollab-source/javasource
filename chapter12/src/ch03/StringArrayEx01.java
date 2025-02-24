package ch03;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayEx01 {

	public static void main(String[] args) {

		// 문자열 데이터를 담는 ArrayList
		ArrayList<String> stringList = new ArrayList<String>();
		System.out.println("Initial size of stringList: " + stringList.size());

		// 문자열 데이터를 추가한다.
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Cherry");
		System.out.println("Size of stringList after adding elements: " + stringList.size());

		// 리스트의 요소들을 출력한다.
		System.out.println("\nAccessing element using index:");
		for (int i = 0; i < stringList.size(); i++) {
			System.out.println(stringList.get(i));
		}

		// 반복자를 사용하여 리스트 출력
		System.out.println("\nAccessing elements using Iterator:");
		Iterator<String> it = stringList.iterator();

		while (it.hasNext()) { // 데이터 존재 여부 확인
			String fruit = it.next(); // 있으면 데이터 가져옴
			System.out.println(fruit);
		}
	}
}