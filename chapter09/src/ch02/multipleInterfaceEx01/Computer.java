package ch02.multipleInterfaceEx01;

public class Computer implements Keyboard, Mouse {
	@Override
	public void click() {
		System.out.println("마우스를 클릭합니다");
	}

	@Override
	public void typing() {
		System.out.println("키보드로 타자칩니다.");
	}
}