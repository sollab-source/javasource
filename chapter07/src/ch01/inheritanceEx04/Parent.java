package ch01.inheritanceEx04;

public class Parent {

	public Parent() {
		System.out.println("부모 기본 생성자 호출");
	}

	public Parent(String str) {
		System.out.println("매개변수로 받은 값: " + str);
		System.out.println("String 변수를 매개변수로 받는 생성자 호출");
	}

	public Parent(int num) {
		System.out.println("매개변수로 받은 값: " + num);
		System.out.println("int형 변수를 매개변수로 받는 생성자 호출");
	}

	public Parent(String str, int num) {
		System.out.println("매개변수로 받은 값: " + str + num);
		System.out.println("String과 int형 변수를 매개변수로 받는 생성자 호출");
	}
}