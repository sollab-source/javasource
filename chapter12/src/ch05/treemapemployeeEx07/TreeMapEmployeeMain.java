package ch05.treemapemployeeEx07;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeMain {

	public static void main(String[] args) {

		// TreeMap 객체 생성
		TreeMap<Integer, Employee> employeeMap = new TreeMap<>();

		// 직원의 ID를 키로, 직원 객체(Employee)를 값으로 TreeMap에 추가
		Employee member1 = new Employee("Alice", 30);
		employeeMap.put(102, member1);
		employeeMap.put(101, new Employee("Bob", 25));
		employeeMap.put(104, new Employee("charlie", 35));
		employeeMap.put(103, new Employee("David", 28));

		// 직원정보 출력(ID 순서대로 자동 정렬됨)
		System.out.println("== 학생 성적 출력 (이름순 정렬) ==");
		for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + "| NAME:"
					+ entry.getValue() + "점");
		}

		// 특정 직원 정보 조회
		int employeeId = 103;
		System.out.println("\nID " + employeeId + "의 직원 정보: "
				+ employeeMap.get(employeeId));
	}
}