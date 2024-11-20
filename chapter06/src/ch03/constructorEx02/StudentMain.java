package ch03.constructorEx02;

public class StudentMain {

	public static void main(String[] args) {

		Student studentChoi = new Student();
		Student studentOh = new Student();

		System.out.println("studentChoi의 school : " + studentChoi.school);
		System.out.println("studentOh의 school : " + studentOh.school);
	}
}