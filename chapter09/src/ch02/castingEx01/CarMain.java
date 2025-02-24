package ch02.castingEx01;

public class CarMain {
	public static void main(String[] args) {
		// 구현 객체 생성
		Bus bus = new Bus();
		ExpressBus expressBus = new ExpressBus();

		Truck truck = new Truck();
		DumpTruck dumpTruck = new DumpTruck();

		// 인터페이스 타입의 참조변수 선언
		Car car;

		// 참조변수에 구현 객체 대입
		car = bus;
		car = expressBus;
		car = truck;
		car = dumpTruck;
	}
}