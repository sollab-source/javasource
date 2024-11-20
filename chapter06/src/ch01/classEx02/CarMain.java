package ch01.classEx02;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car();

		System.out.println("현재 가진 멤버변수 name의 값 : " + car.name);

		// 클래스 외부에서
		car.name = "아반떼";

		System.out.println("수정된 멤버변수 name의 값 : " + car.name);
	}
}