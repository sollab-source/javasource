package ch03.castingEx03;

public class Child extends Parent {
	String childField = "자식의 멤버변수";

	@Override
	public void parentMethod() {
		System.out.println("재정의된 부모의 메소드");
	}

	public void childMethod() {
		System.out.println("자식의 메소드");
	}
}