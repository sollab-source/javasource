package ch02;

import java.util.ArrayList;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {

		// ArrayList 생성
		// ArrayList<String> student=new ArrayList<String>();
		List<String> students = new ArrayList<String>();

		students.add("Alice");
		students.add("Bob");
		students.add("Charlie");
		students.add("Diana");

		// 학생 출력
		System.out.println("Student in the list");
		for (String student : students) {
			System.out.println(student);
		}

		// 특정 학생을 제거
		students.remove("Bob");

		// 학생 출력
		System.out.println("\nAfter removing Bob");
		for (String student : students) {
			System.out.println(student);
		}
	}
}