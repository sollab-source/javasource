package ch05.treemapemployeeEx07;

public class Employee {

	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "(" + age + "세)";
	}
}