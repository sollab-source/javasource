package ch03.constructorEx04;

public class Employee {

	String name;
	int employeeNum;
	String position;

	// 기본생성자
	public Employee() {
	}

	// 생성자 오버로딩
	public Employee(String eName, int eNum, String ePosition) {
		name = eName;
		employeeNum = eNum;
		position = ePosition;
	};

	// 생성자 오버로딩
	public Employee(String eName) {
		name = eName;
	};
}