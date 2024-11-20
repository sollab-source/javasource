package ch02.overrideEx01;

public class AutonomousCar extends Car {

	@Override
	public void drive() {
		System.out.println("자동차가 자율주행을 합니다.");
	}
}