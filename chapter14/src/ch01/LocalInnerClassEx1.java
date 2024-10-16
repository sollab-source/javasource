package ch01;



class OuterClass3 {
	// 외부 클래스 멤버 필드
	private String secret = "Time is money";

	public void method() {
		
		// final 변수임
		int num1 = 10;		
		
		// 로컬 내부 클래스 선언
		class InnerClass2 {
			
			// 정적 멤버
			static int field1;
			// 멤버 변수
			int field2;

			public InnerClass2() {
				System.out.println("내부 클래스 생성자 ");	
				field1 = 20;
				field2 = 15;
			}

			void print() {				
				// 외부 클래스 멤버 필드 사용
				System.out.println(secret);
				System.out.println("method 내 선언된 로컬 변수 : "+num1);
				System.out.println("로컬 내부 클래스 멤버 : "+field1+" "+field2);
			}			
		} // 로컬 내부 클래스 종료
		
		InnerClass2 inner = new InnerClass2();
		inner.print();		
	}// 외부 클래스 method() 종료
}// 외부 클래스 종료

public class LocalInnerClassEx1 {
	public static void main(String[] args) {
		OuterClass3 out = new OuterClass3();
		out.method();
	}
}