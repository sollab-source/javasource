package ch01;

class Outer {
	// 외부 클래스 멤버 변수
	private int iPos = 10;  
	// 외부 클래스 정적 변수
	private static int sPos = 20;    
	
	// 내부 클래스 참조 변수 선언
	private Inner inner;     
		
	public Outer() {
		// 외부 클래스 생성자에서 내부 클래스 인스턴스 생성 
		inner = new Inner();        
	}	
	
	// 내부 클래스 선언
	class Inner{           
		// 내부 클래스 인스턴스 변수
		int iNum = 100;    
		
		// JDK16 부터 정적필드 및 메소드 선언 가능
		static int sNum = 200;
		
		static void info() {			
			System.out.println("내부 클래스 메소드의 접근 가능 범위");
		}
		
		 // 내부 클래스 인스턴스 메소드
		void print() {			
			System.out.println();
			System.out.println("외부 클래스 멤버 변수 및 정적 변수");
			System.out.printf("Outer class num = %d\n",iPos);
			System.out.printf("Outer class pos = %d\n",sPos);
			System.out.println();
			System.out.println("내부 클래스 멤버 변수 및 정적 변수");
			System.out.printf("Inner class iNum = %d\n",iNum);
			System.out.printf("Inner class sNum = %d\n",sNum);		
		}		
	} // 내부 클래스 종료
	
	public void start() {
		// 내부 클래스 정적 메소드 호출
		Inner.info();
		// 내부 클래스 메소드 호출
		inner.print(); 
	}
}// 외부 클래스 종료

public class InstanceInnerClassEx2 {
	public static void main(String[] args) {
		Outer outer = new Outer();	
		outer.start();	
	}
}


// 인스턴스 내부 클래스 직접 생성하는 방법
//Outer out = new Outer();
//Outer.Inner inClass = out.new Inner();
//inClass.method();
//
//System.out.println(Inner.sNum);
//Inner.print();



