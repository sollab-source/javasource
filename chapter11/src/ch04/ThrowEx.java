package ch04;

public class ThrowEx {

	public static void main(String[] args) {
		try {
			throw new Exception("강제 예외 발생");
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
			e.printStackTrace(); 
		}
		System.out.println("program end");
	}
}
