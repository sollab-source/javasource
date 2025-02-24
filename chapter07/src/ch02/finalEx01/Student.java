package ch02.finalEx01;

public class Student {

	private int no;
	private String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public final void displayInfo() {
		System.out.println("학번: " + no + " | " + "이름 : " + name);
	}
}