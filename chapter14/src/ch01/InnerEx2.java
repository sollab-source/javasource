package ch01;

class Outer2 {
	// 외부 클래스 인스턴스 변수
	private int iPos = 10;
	// 외부 클래스 정적 변수
	private static int sPos = 20;

	// 내부 클래스 선언
	static class InnerStaticClass { 
		// 내부 클래스 인스턴스 변수
		int iNum = 100; 
		// 내부 클래스 정적 변수
		static int sNum = 200; 

		void method() {
			// 에러 발생(내부정적 클래스에서 외부 인스턴스 변수 사용 불가)
			// iPos += 10; 

			System.out.printf("InnerStaticClass iNum = %d (내부 클래스 인스턴스 변수)\n", iNum);
			System.out.printf("InnerStaticClass sNum = %d (내부 클래스 정적 변수)\n", sNum);
			System.out.printf("Outer class sPos = %d (외부 클래스 정적 변수)\n", sPos);
		}

		static void method2() {
			System.out.printf("InnerStaticClass sNum = %d (내부 클래스 정적 변수)\n", sNum);
			System.out.printf("Outer class sPos = %d (외부 클래스 정적 변수)\n", sPos);
		}
	} // 내부 클래스 종료
}// 외부 클래스 종료

public class InnerEx2 {
	public static void main(String[] args) {
		// 외부 클래스 생성 없이 내부 클래스 인스턴스 생성 가능
		Outer2.InnerStaticClass inner = new Outer2.InnerStaticClass();
		// 내부 클래스 참조 변수로 인스턴스 메소드 호출
		inner.method(); 
		 // 정적 내부 클래스 참조 변수로 인스턴스 메소드 호출
		Outer2.InnerStaticClass.method2();
	}
}
