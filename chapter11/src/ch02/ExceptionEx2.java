package ch02;

public class ExceptionEx2 {

	public static void main(String[] args) {
		String[] sarr = { "soldesk", "developer", "course" };

		for (int i = 0; i <= sarr.length; i++) {
			try {
				System.out.println(sarr[i]);
			} catch (Exception e) {
				System.out.println("예외 발생");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("program end!!");
	}
}
