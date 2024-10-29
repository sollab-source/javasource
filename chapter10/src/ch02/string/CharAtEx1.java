package ch02.string;

public class CharAtEx1 {
	public static void main(String[] args) {
		
		String koreanId = "0003193123456";
		char gender = koreanId.charAt(6);

		System.out.println(gender - '0');

		if (gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		}
	}
}
