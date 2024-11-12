package chapter13.quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExam02 {

	public static void main(String[] args) {

		// 2.문제 (Set 관련): HashSet을 사용하여, 사용자가 입력한 숫자들 중 중복된 값을 제거하고, 중복이 제거된 숫자들을 한 줄에
		// 하나씩 출력하는 코드를 작성하세요.
		// 사용자로부터 입력된 숫자들
		List<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		numbers.add(5);

		// 정답
		HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
		for (Integer number : uniqueNumbers) {
			System.out.println(number);
		}

	}

}

/*
 설명
• 사용자가 List에 숫자를 추가했을 때, 중복된 숫자가 포함되어 있을 수 있습니다.
• HashSet은 중복된 값을 자동으로 제거하기 때문에, List를 HashSet으로 변환하면 중복된 숫자들이 제거됩니다.
• HashSet에 있는 모든 숫자를 출력합니다.  
 */
