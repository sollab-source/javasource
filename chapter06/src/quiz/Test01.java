package quiz;

public class Test01 {

	public static void main(String[] args) {
		// Student 객체 생성
		Student student = new Student();

		// 멤버 변수 값 설정
		student.name = "홍길동";
		student.age = 30;

		// 출력
		System.out.println("이름: " + student.name);
		System.out.println("나이: " + student.age);
	}
}
