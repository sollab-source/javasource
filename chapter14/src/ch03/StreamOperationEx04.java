package ch03;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationEx04 {
	public static void main(String[] args) {
		Student[] stuArr = { new Student(1, "홍길동", 85), new Student(2, "이범석", 77), new Student(3, "김홍석", 84),
				new Student(4, "최민호", 56), new Student(5, "김수정", 66), new Student(6, "최혜진", 79) };

		// 학생 이름만 추출 후 리스트에 저장
		List<String> names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
		System.out.println(names);

		// 영어 점수만 추출 후 리스트에 저장
		List<Integer> engs = Stream.of(stuArr).map(Student::getEng).collect(Collectors.toList());
		System.out.println(engs);

		// 영어 점수가 70점 이상인 학생들의 이름만 리스트에 저장
		names = Stream.of(stuArr).filter(s -> s.getEng() >= 70).map(Student::getName).collect(Collectors.toList());
		System.out.println(names);
	}
}