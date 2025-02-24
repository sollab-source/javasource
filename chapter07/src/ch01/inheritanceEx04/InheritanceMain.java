package ch01.inheritanceEx04;

public class InheritanceMain {

	public static void main(String[] args) {
		Child child1 = new Child();
		System.out.println("-------------------");
		Child child2 = new Child("Hello");
		System.out.println("-------------------");
		Child child3 = new Child(100);
		System.out.println("-------------------");
		Child child4 = new Child("Java", 200);
	}
}