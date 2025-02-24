package quiz.answer;

public class Test03 {
	/* extension 메서드 구현 */

	public String extension(String filename) {

		int index = filename.indexOf(".");
		String ext = filename.substring(index + 1);

		return ext;
	}

	public static void main(String[] args) {
		String filename = "soldesk.txt";
		Test03 test03 = new Test03();

		String ext = test03.extension(filename);
		System.out.println("파일의 확장자 : " + ext);
	}
}