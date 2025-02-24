package ch03.constructorEx04;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee employee = new Employee();
		Employee employeeLee = new Employee("이순신", 241026, "과장");
		Employee employeeWon = new Employee("원균");

		System.out.println("기본생성자로 만든 객체의 name : " + employee.name);
		System.out.println("기본생성자로 만든 객체의 employeeNum : " + employee.employeeNum);
		System.out.println("기본생성자로 만든 객체의 position : " + employee.position);

		System.out.println("-----------------------------------");

		System.out.println("employeeLee의 name : " + employeeLee.name);
		System.out.println("employeeLee의 employeeNum : " + employeeLee.employeeNum);
		System.out.println("employeeLee의 position : " + employeeLee.position);

		System.out.println("-----------------------------------");

		System.out.println("employeeWon의 name : " + employeeWon.name);
		System.out.println("employeeWon의 employeeNum : " + employeeWon.employeeNum);
		System.out.println("employeeWon의 position : " + employeeWon.position);
	}
}