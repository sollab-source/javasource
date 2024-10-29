package ch10.quiz;

public class Test3 {
	/* extension 메서드 구현 */

	public String extension(String filename) {
		
		int index = filename.indexOf(".");
		String ext = filename.substring(index + 1);
		
		return ext;
	}

	public static void main(String[] args) {
		String filename = "soldesk.txt";
		Test3 test3 = new Test3();

		String ext = test3.extension(filename);
		System.out.println("파일의 확장자 : " + ext);
	}

}