package ch02.finalEx01;

public class HumanitiesStudent extends Student {

	private String major;

	public HumanitiesStudent(int no, String name, String major) {
		super(no, name);
		this.major = major;
	}

	/*
	 부모의 displayInfo() 메소드가 final로 선언되어 재정의 불가
	 @Override public void displayInfo() {}
	 */
}
