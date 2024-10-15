package ch01;

import ch01.Outer.Inner;
import ch01.OuterClass2.StaticInnerClass;

class OuterClass2 {
	// 외부 클래스 인스턴스 변수
	private int iPos = 10;
	// 외부 클래스 정적 변수
	private static int sPos = 20;

	// 정적 내부 클래스 선언
	static class StaticInnerClass { 
		// 정적 내부 클래스 멤버 변수
		int iNum = 100; 
		// 정적 내부 클래스 정적 변수
		static int sNum = 200; 

		void method() {
			// 에러 발생(내부 정적 클래스에서 외부 멤버 변수 사용 불가)
			// iPos += 10; 
			
			// 에러 발생에 대한 부분을 설명란 코드로 작성
//			System.out.println("내부 클래스 멤버 변수");
//			OuterClass2 outer = new OuterClass2();
//			System.out.println(outer.iPos);
			
			
			System.out.println("내부 클래스 멤버 변수");
			System.out.printf("StaticInnerClass iNum = %d\n", iNum);
			System.out.println("내부 클래스 정적 변수");
			System.out.printf("StaticInnerClass sNum = %d\n", sNum);
			System.out.println("외부 클래스 정적 변수");
			System.out.printf("Outer class sPos = %d\n", sPos);
		}

		static void method2() {		
			
			// static 메서드 안에서 내부 클래스 멤버를 사용
			// 해야 한다면 객체를 먼저 생성해야 한다.
//			System.out.println("내부 클래스 멤버 변수");
//			StaticInnerClass inner = new StaticInnerClass();
//			System.out.println(inner.iNum);
		
			System.out.println();
			System.out.println("내부 클래스 정적 변수");
			System.out.printf("StaticInnerClass sNum = %d\n", sNum);
			System.out.println();
			System.out.println("외부 클래스 정적 변수");
			System.out.printf("Outer class sPos = %d\n", sPos);
		}
	} // 내부 클래스 종료
	
	public void start() {
		// 내부 클래스 정적 메소드 호출
		StaticInnerClass.method2();
		// 내부 클래스 멤버 메소드 호출
		StaticInnerClass inner = new StaticInnerClass();
		inner.method(); 
	}
}// 외부 클래스 종료

public class StaticInnerClassEx1 {
	public static void main(String[] args) {
		
		// 정적 내부 클래스 
		// 정적 내부 클래스 참조 변수로 인스턴스 메소드 호출
		//OuterClass2.StaticInnerClass.method2();
		
		
		// 정적 내부 클래스의 static 메소드 호출 
		StaticInnerClass.method2();
		
		// 외부 클래스 생성 없이 내부 클래스 인스턴스 생성 가능
		//OuterClass2.StaticInnerClass inner = new OuterClass2.StaticInnerClass();
		// 내부 클래스 참조 변수로 인스턴스 메소드 호출
		//inner.method(); 
	}
}
