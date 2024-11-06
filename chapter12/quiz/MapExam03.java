package chapter13.quiz;

import java.util.HashMap;
import java.util.Map;

public class MapExam03 {

	public static void main(String[] args) {
		// 3.문제 (Map 관련): HashMap을 사용하여 학생의 이름과 점수를 저장하고, 점수가 60점 이상인 학생만 출력하는 코드를
		// 작성하세요.

		HashMap<String, Integer> students = new HashMap<>();
		students.put("Alice", 85);
		students.put("Bob", 45);
		students.put("Charlie", 78);
		students.put("Dave", 59);

		// 정답
		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			if (entry.getValue() >= 60) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}

	}

}
