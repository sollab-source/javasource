package ch04.singletonEx01;

public class School {

	// static으로 선언해 프로그램에서 사용할 단 하나의 School 인스턴스를 생성
	private static School instance = new School();

	// 접근제어자가 private이므로 외부에서 School 인스턴스를 생성할 수 없음
	private School() {
	};

	// 유일하게 만들어진 school 객체를 외부에서 참조할 수 있도록 정적메소드 구현
	// 인스턴스 생성과 상관없이 호출해야 하므로 정적메소드를 선언
	public static School getInstance() {
		return instance;
	}
}