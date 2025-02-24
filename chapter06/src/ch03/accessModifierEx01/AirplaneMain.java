package ch03.accessModifierEx01;

public class AirplaneMain {

	public static void main(String[] args) {

		Airplane air = new Airplane();
		// air.altitude = -10; => 멤버변수에 직접 접근 불가
		air.setAltitude(-10);// setter메소드로 매개값 제약

		System.out.println(air.getAltitude());// getter메소드로 멤버변수 불러오기
	}
}