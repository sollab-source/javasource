package ch01;

class OuterClass1 {
	// 외부 클래스 멤버 변수
	private int iPos = 10;
	// 외부 클래스 정적 변수
	private static int sPos = 20;
	

	// 정적 중첩 클래스 선언
	static class StaticNestedClass { 
		// 정적 중첩 클래스 멤버 변수
		int iNum = 100; 
		// 정적 중첩 클래스 정적 변수
		static int sNum = 200; 

		void method1() {
			// 에러 발생
			// 내부 정적 클래스에서 외부 멤버 변수 사용 불가
			// iPos += 10;		
			
			System.out.println("정적 중첩 클래스 멤버 / 정적 변수");
			System.out.printf("StaticNestedClass iNum = %d, sNum = %d\n", iNum,sNum);		
			
			System.out.println("외부 클래스 정적 변수");
			System.out.printf("Outer class sPos = %d\n", sPos);
		}

		static void method2() {
			// 에러 발생
			// static 메소드에서 멤버 변수 사용 불가
			// iNum += 10;
			
			System.out.println();
			System.out.println("정적 중첩 클래스 정적 변수");
			System.out.printf("StaticInnerClass sNum = %d\n", sNum);
			System.out.println();
			System.out.println("외부 클래스 정적 변수");
			System.out.printf("Outer class sPos = %d\n", sPos);
		}
	} // 정적중첩클래스 종료	
}// 외부 클래스 종료

public class StaticNestedClassEx01 {
	public static void main(String[] args) {
				
		// 외부 클래스 생성 없이 정적중첩클래스 인스턴스 생성
		OuterClass1.StaticNestedClass nested = new OuterClass1.StaticNestedClass();
		// 중첩 클래스 내 인스턴스 메소드 호출
		nested.method1(); 
		
		// 정적중첩 클래스 내 정적 메소드 호출
		OuterClass1.StaticNestedClass.method2();
	}
}
