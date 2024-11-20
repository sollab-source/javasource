package ch03.constructorEx03;

public class Student {

	String name;
	String major;

	// 생성자를 통해 멤버변수 초기화
	public Student(String sName, String sMajor) {
		name = sName;
		major = sMajor;
	}
}