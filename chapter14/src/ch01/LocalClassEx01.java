package ch01;

class OuterClass4 {
	// 외부 클래스 멤버 필드
	private String secret = "Time is money";
	static int outerCv = 0;

	public void method() {

		// final 변수
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
				// 외부 클래스 멤버 변수 사용
				System.out.println("외부 클래스 멤버 변수 " + secret + ", static " + outerCv);

				// 값 변경 불가 에러 발생
				// num1 은 final 이 없어도 final 로 처리됨
				// num1 = 20;
				System.out.println("method 내 선언된 로컬 변수 : " + num1);

				System.out.println("로컬 내부 클래스 멤버 : " + field1 + " " + field2);
			}
		} // 로컬 내부 클래스 종료

		InnerClass2 inner = new InnerClass2();
		inner.print();
	}// 외부 클래스 method() 종료
}// 외부 클래스 종료

public class LocalClassEx01 {
	public static void main(String[] args) {
		OuterClass4 out = new OuterClass4();
		out.method();
	}
}