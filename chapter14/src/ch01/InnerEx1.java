package ch01;

import ch01.Outer.Inner;

class Outer {
	private int iPos = 10;           // 외부 클래스 인스턴스 변수
	private static int sPos = 20;    // 외부 클래스 정적 변수
	
	private Inner inner;            // 내부 클래스 참조 변수 선언
	
	
//	public Outer() {
//		inner = new Inner();        // 외부 클래스 생성자에서 내부 클래스 인스턴스 생성 
//	}	
	
	class Inner{                    // 내부 클래스 선언
		int iNum = 100;             // 내부 클래스 인스턴스 변수
		static int sNum = 200;
		
		static void print() {
			System.out.println("안녕하세요");
		}
		
		void method() {             // 내부 클래스 인스턴스 메소드
			System.out.printf("Outer class num = %d (외부 클래스 인스턴스 변수)\n",iPos);
			System.out.printf("Outer class pos = %d (외부 클래스 정적 변수)\n",sPos);
			System.out.printf("Inner class iNum = %d (내부 클래스 인스턴스 변수)\n",iNum);
			System.out.printf("Inner class sNum = %d (내부 클래스 정적 변수)\n",sNum);
		}		
	} // 내부 클래스 종료
	
	public void start() {
		inner.method();             // 내부 클래스 메소드 호출
	}
}// 외부 클래스 종료

public class InnerEx1 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		System.out.println("외부 클래스를 통해 내부 클래스 사용");
		outer.start();

		
//	    인스턴스 내부 클래스 직접 생성하는 방법
		Outer out = new Outer();
		Outer.Inner inClass = out.new Inner();
		inClass.method();
		
		System.out.println(Inner.sNum);
		Inner.print();
	}
}






