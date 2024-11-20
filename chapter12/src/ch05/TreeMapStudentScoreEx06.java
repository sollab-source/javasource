package ch05;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudentScoreEx06 {

	public static void main(String[] args) {

		// TreeMap 객체 생성
		TreeMap<String, Integer> studentScores = new TreeMap<>();

		// 학생의 이름을 키로, 점수를 값으로 TreeMap에 추가
		studentScores.put("David", 95);
		studentScores.put("Bob", 92);
		studentScores.put("Alice", 85);
		studentScores.put("Charlie", 78);

		// TreeMap에 저장된 항목 출력 (이름순으로 자동 정렬됨)
		System.out.println("== 학생 성적 출력 (이름순 정렬) ==");
		for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + "점");
		}

		// 특정 학생의 이름으로 조회
		String studentName = "Bob";
		System.out.println("\n" + studentName + "의 성적:" + studentScores.get(studentName) + "점");
	}
}