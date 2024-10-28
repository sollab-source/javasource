package ch01;

class OuterClass2 {		
	// 외부 클래스 멤버 필드
	private String secret = "Time is money";
	
	public OuterClass2(){
		// 내부 클래스 객체 생성
		MemberClass inner = new MemberClass();
		// 내부 클래스 메소드 호출
		inner.print();
	}	
	
	// 내부 클래스 선언
	class MemberClass{    
		
		public MemberClass() {
			System.out.println("내부 클래스 생성자");
		}
		
		void print() {
			//외부 클래스 멤버 필드 사용
			System.out.println(secret);
		}			
	} // 내부 클래스 종료	
}// 외부 클래스 종료

public class MemberClassEx01 {
	public static void main(String[] args) {
		new OuterClass2();		
	}
}