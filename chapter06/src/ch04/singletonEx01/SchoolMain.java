package ch04.singletonEx01;

public class SchoolMain {

	public static void main(String[] args) {

		School school01 = School.getInstance();
		School school02 = School.getInstance();

		// 참조변수 school01과 school02는 동일한 인스턴스를 참조
		System.out.println(school01);
		System.out.println(school02);
	}
}