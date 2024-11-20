package ch01.inheritanceEx04;

public class Child extends Parent {

	public Child() {
		super();
		System.out.println("Child03 객체 생성");
	}

	public Child(String str) {
		super(str);
		System.out.println("Child03 객체 생성");
	}

	public Child(int num) {
		super(num);
		System.out.println("Child03 객체 생성");
	}

	public Child(String str, int num) {
		super(str, num);
		System.out.println("Child03 객체 생성");
	}
}