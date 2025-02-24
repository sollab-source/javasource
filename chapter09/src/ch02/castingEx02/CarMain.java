package ch02.castingEx02;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Bus();// 인터페이스 선언
		car.startEngine();
		car.stopEngine();
		// car.getPassenger(3); => 호출불가
		System.out.println("=================");
		Bus bus = (Bus) car;// 강제 형 변환
		bus.startEngine();
		bus.stopEngine();
		bus.getPassenger(3);// 구현 클래스에서 구현한 메소드 사용 가능
	}
}