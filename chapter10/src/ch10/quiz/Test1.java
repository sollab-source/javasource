package ch10.quiz;

public class Test1 {
	/* removeChar메서드 선언  */
	public static String removeChar(String str, String del) {
		String nwstr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (del.indexOf(ch) == -1) {
				nwstr += "" + ch;
			}
		}
		return nwstr;
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + "->" + removeChar("(1!2@3^4~5)", "!@^~()"));
		System.out.println("(1 2\t3)" + " -> " + removeChar("(1 23)", " "));
	}
}
