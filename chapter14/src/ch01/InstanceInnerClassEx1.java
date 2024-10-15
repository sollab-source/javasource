package ch01;

class OuterClass {		
	// 외부 클래스 멤버 필드
	private String secret = "Time is money";
	
	public OuterClass(){
		// 내부 클래스 객체 생성
		InnerClass inner = new InnerClass();
		// 내부 클래스 메소드 호출
		inner.print();
	}	
	
	// 내부 클래스 선언
	class InnerClass{    
		
		public InnerClass() {
			System.out.println("내부 클래스 생성자");
		}
		
		void print() {
			//외부 클래스 멤버 필드 사용
			System.out.println(secret);
		}
	} // 내부 클래스 종료	
}// 외부 클래스 종료

public class InstanceInnerClassEx1 {
	public static void main(String[] args) {
		new OuterClass();		
	}
}