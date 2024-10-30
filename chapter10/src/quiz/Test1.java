package quiz;

public class Test1 {

	/* removeChar() 메서드 구현  */
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + "->" + removeChar("(1!2@3^4~5)", "!@^~()"));
		System.out.println("(1 2\t3)" + " -> " + removeChar("(1 23)", " "));
	}

}
