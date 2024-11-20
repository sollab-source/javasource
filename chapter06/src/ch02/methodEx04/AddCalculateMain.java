package ch02.methodEx04;

public class AddCalculateMain {

	public static void main(String[] args) {

		AddCalculate addCal = new AddCalculate();

		// AddCalculate 객체의 int 형 매개변수 2개를 받는 add() 메소드 호출
		int result01 = addCal.add(1, 2);
		System.out.println("int 형 매개변수 2개를 받는 add() 메소드 : " + result01);

		// AddCalculate 객체의 double 형 매개변수 2개를 받는 add() 메소드 호출
		double result02 = addCal.add(1.2, 2.1);
		System.out.println("double 형 매개변수 2개를 받는 add() 메소드 : " + result02);

		// AddCalculate 객체의 int 형 매개변수 3개를 받는 add() 메소드 호출
		double result03 = addCal.add(3, 4, 5);
		System.out.println("int 형 매개변수 3개를 받는 add() 메소드 : " + result03);
	}
}