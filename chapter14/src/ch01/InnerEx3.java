package ch01;

class Outer3 {
	private int iPos = 10;            // 외부 클래스 인스턴스 변수
	private static int sPos = 20;     // 외부 클래스 정적 변수
	
	
	 void outerMethod() {
		
		int localNum = 1;                  // 외부 클래스 메소드 내 로컬 변수(final 임)
		
		class Inner{                       // 내부 클래스 선언
			int iNum = 100;                // 내부 클래스 인스턴스 변수
			static int sNum = 200;         // 내부 클래스 정적 변수		
			
			void method() {	               // 내부 클래스 메소드 선언		
				
				// localNum = 20;(X)       // localNum 은 final 이기 때문에 수정 불가
				
				System.out.printf("Outer Class iPos = %d (외부 클래스 인스턴스 변수)\n",iPos);
				System.out.printf("Outer Class sPos = %d (외부 클래스 정적 변수)\n",sPos);
				System.out.printf("Outer Class method 로컬 변수 localNum = %d (외부 클래스 메소드 지역 변수)\n",localNum);
				System.out.println();
				System.out.printf("Local Inner class iNum = %d (로컬 클래스 인스턴스 변수)\n",iNum);
				System.out.printf("Local Inner class sNum = %d (로컬 클래스 정적 변수)\n",sNum);
				System.out.println();
			}		
		} // 내부 클래스 종료		
		
		Inner inner = new Inner();        // 지역 내부 클래스 인스턴스 생성
		inner.method();                   // 지역 내부 클래스 메소드 호출
		
	} //method 종료	 
} // 외부 클래스 종료

public class InnerEx3 {
	public static void main(String[] args) {		
		Outer3 outer = new Outer3();
		outer.outerMethod();
	}
}






