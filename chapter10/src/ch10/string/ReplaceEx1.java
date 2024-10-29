package ch10.string;

public class ReplaceEx1 {

	public static void main(String[] args) {

		String ostr = "String클래스로 자바 문자열을 표현한다. 자바 문자열은 변하지 않는다.";
		String nstr = ostr.replace("자바", "JAVA");

		System.out.println(nstr);
		System.out.println(ostr);

	}

}
