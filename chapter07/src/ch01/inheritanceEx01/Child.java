package ch01.inheritanceEx01;

public class Child extends Parent {

	String childField = "자식 멤버변수";

	public void childMethod() {
		System.out.println("자식 메소드");
	}
}