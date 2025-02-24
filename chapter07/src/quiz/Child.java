package quiz;

public class Child extends Parent {

	@Override
	public void parentMethod() {
		System.out.println("자식 클래스 메소드 호출");
	}

	public void childMethod() {
		System.out.println("자식 클래스의 고유 메소드 호출");
	}
}