package chapter13.ch04.comparatoremployeeEx08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorEmployeeMain {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Charlie", 35));
		employees.add(new Employee("Bob", 25));
		employees.add(new Employee("Alice", 30));

		// 이름을 기준으로 정렬
		Collections.sort(employees, new NameComparator());
		System.out.println("이름을 기준으로 정렬: ");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		// 나이를 기준으로 정렬
		Collections.sort(employees, new AgeComparator());
		System.out.println("나이를 기준으로 정렬: ");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
