package quiz;

public class Test2 {

	/* palindrome() 메서드 구현 */

	public static void main(String[] args) {
		String str = "기러기";
		
		if (palindrome(str)) {
			System.out.println(str + "은 회문 입니다.");
		} else {
			System.out.println(str + "은 회문이 아닙니다.");
		}

	}

}
