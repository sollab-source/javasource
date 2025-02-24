package ch03.constructorEx03;

public class StudentMain {

	public static void main(String[] args) {

		Student studentHong = new Student("홍길동", "컴퓨터공학과");
		Student studentKang = new Student("강감찬", "정보통신공학과");

		System.out.println("studentHong의 name : " + studentHong.name
				+ ", studentKang의 major : " + studentHong.major);
		System.out.println("studentKang의 name : " + studentKang.name
				+ ", studentKang의 major : " + studentKang.major);
	}
}