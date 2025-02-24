package ch04.staticEx01;

public class StaticTestMain {

	public static void main(String[] args) {

		System.out.println(StaticTest.a);// 정적변수는 인스턴스 생성 없이 호출

		StaticTest st01 = new StaticTest();
		st01.b = "st01의 멤버변수";
		System.out.println("st01 인스턴스의 정적변수 : " + st01.a);
		System.out.println("st01 인스턴스의 멤버변수 : " + st01.b);

		System.out.println("====================================");
		StaticTest st02 = new StaticTest();
		st02.b = "st02의 멤버변수";
		System.out.println("st02 인스턴스의 정적변수 : " + st02.a);
		System.out.println("st02 인스턴스의 멤버변수 : " + st02.b);

		System.out.println("====================================");
		st01.a = "st01이 정적변수 변경";
		System.out.println("st01 인스턴스의 정적변수 : " + st01.a);
		System.out.println("st02 인스턴스의 정적변수 : " + st02.a);

		System.out.println("====================================");
		st01.b = "st01의 멤버변수 변경";
		System.out.println("st01 멤버변수 : " + st01.b);
		System.out.println("st02 멤버변수 : " + st02.b);
	}
}