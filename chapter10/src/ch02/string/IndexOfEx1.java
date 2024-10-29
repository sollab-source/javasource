package ch02.string;

public class IndexOfEx1 {

	public static void main(String[] args) {

		int index = "ABCDE".indexOf("D");
		if (index == -1) {
			System.out.println("찾는 문자열이 없습니다.");
		} else {
			System.out.println("Z는 " + (index + 1) + "번째에 있습니다.");
		}

		if ("ABCDE".contains("ABC")) {
			System.out.println("찾는 문자열이 있습니다.");
		} else {
			System.out.println("없습니다.");
		}
	}

}
