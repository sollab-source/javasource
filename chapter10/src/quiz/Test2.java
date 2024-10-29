package quiz;

public class Test2 {

	static boolean palindrome(String str) {

		String str2 = "";// 역순 문자열 저장 공간

		for (int i = str.length(); i > 0; i--) {
			str2 += str.charAt(i - 1);
		}

		return str.equals(str2);
	}

	public static void main(String[] args) {
		String str = "기러기";
		
		if (palindrome(str)) {
			System.out.println(str + "은 회문 입니다.");
		} else {
			System.out.println(str + "은 회문이 아닙니다.");
		}

	}

}
