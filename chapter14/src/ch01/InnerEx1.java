package ch01;

class Outer {
	private int iPos = 10;           // 외부 클래스 인스턴스 변수
	private static int sPos = 20;    // 외부 클래스 정적 변수
	
	private Inner inner;            // 내부 클래스 참조 변수 선언
	
	
	public Outer() {
		inner = new Inner();        // 외부 클래스 생성자에서 내부 클래스 인스턴스 생성 
	}	
	
	class Inner{                    // 내부 클래스 선언
		int iNum = 100;             // 내부 클래스 인스턴스 변수
		
		void method() {             // 내부 클래스 인스턴스 메소드
			System.out.printf("Outer class num = %d (외부 클래스 인스턴스 변수)\n",iPos);
			System.out.printf("Outer class pos = %d (외부 클래스 정적 변수)\n",sPos);
			System.out.printf("Inner class iNum = %d (내부 클래스 인스턴스 변수)\n",iNum);
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
		
//		Outer out = new Outer();
//		Outer.Inner inClass = out.new Inner();
//		inClass.method();
	}
}






