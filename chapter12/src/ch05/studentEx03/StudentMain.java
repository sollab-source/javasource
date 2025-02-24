package ch05.studentEx03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {

		// 학생정보, 점수
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		// 중복X
		map.put(new Student(1, "이수정"), 95);
		map.put(new Student(1, "이수정"), 95);

		map.put(new Student(2, "김우진"), 85);
		map.put(new Student(3, "박진영"), 98);

		System.out.println("총 인원: " + map.size());

		// 순환구조로 처리
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			Student key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}

		System.out.println();

		Scanner scan = new Scanner(System.in);
		Student std;
		int input;
		String name;

		while (true) {
			System.out.print("학생 번호를 입력하세요 : ");
			input = scan.nextInt();
			System.out.print("학생 이름을 입력하세요 : ");
			name = scan.next();
			std = new Student(input, name);

			if (map.containsKey(std)) {
				System.out.println(name + "학생의 점수는: " + map.get(std));
				break;
			} else {
				System.out.println("해당 학생의 데이터가 존재하지 않습니다.");
			}
		}
	}
}