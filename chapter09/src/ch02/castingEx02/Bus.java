package ch02.castingEx02;

public class Bus implements Car {
	public void getPassenger(int count) {
		System.out.println("버스가 " + count + "명의 승객을 태우다");
	}

	@Override
	public void startEngine() {
		System.out.println("버스의 시동을 키다");
	}

	@Override
	public void stopEngine() {
		System.out.println("버스의 시동을 끄다");
	}
}