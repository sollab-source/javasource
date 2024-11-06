package chapter13.ch04.comparatoremployeeEx08;

public record Employee(String name, int age) {
	
	
	@Override
	public String toString() {
		return name + ": " + age + "세";
	}
}
