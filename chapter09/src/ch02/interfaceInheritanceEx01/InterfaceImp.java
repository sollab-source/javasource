package ch02.interfaceInheritanceEx01;

public class InterfaceImp implements ChildInterface {

	@Override
	public void parentMethodA() {
		System.out.println("부모인터페이스A인 추상메소드 구현");
	}

	@Override
	public void parentMethodB() {
		System.out.println("부모인터페이스B인 추상메소드 구현");
	}

	@Override
	public void childMethod() {
		System.out.println("자식인터페이스인 추상메소드 구현");
	}
}