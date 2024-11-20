package ch03.constructorEx01;

public class EmployeeMain {

	public static void main(String[] args) {

		// 컴파일 오류
		// Employee employee = new Employee();

		// 선언된 생성자
		Employee employee = new Employee("홍길동");
	}
}