package ch03.thisEx01;

public class Human {

	String name;
	int age;

	public Human(String name) {
		this.name = name;
	}

	public void ageUp(int age) {
		this.age = age + 1;
		System.out.println(name + "의 나이 : " + this.age);
	}
}