package ch01.inheritanceEx01;

public class InheritanceMain {

	public static void main(String[] args) {

		// 부모 클래스 객체 생성 및 필드, 메서드 호출
		Parent parent = new Parent();

		System.out.println("부모 클래스의 필드: " + parent.parentField);
		parent.parentMethod();

		System.out.println("-----------------------------------------");

		// 자식 클래스 객체 생성 및 필드, 메서드 호출
		Child child = new Child();

		System.out.println("자식 클래스의 필드: " + child.childField);
		child.childMethod();

		System.out.println();

		// 부모 클래스로부터 상속받은 필드와 메서드 호출
		System.out.println("부모로부터 상속받은 필드: " + child.parentField);
		child.parentMethod();
	}
}