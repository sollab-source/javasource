package chapter13.ch03;

import java.util.ArrayList;

public class ArrayListIntersectEx02 {

	public static void main(String[] args) {
		 // 첫 번째 ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // 두 번째 ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        // 교집합을 찾음
        ArrayList<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);

        // 결과 출력
        System.out.println("두 리스트의 교집합: " + intersection);

	}
}
