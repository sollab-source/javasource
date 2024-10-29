package ch02.string;

public class SubStringEx1 {

	public static void main(String[] args) {
		String filename = "soldesk.java";
		int index = filename.indexOf(".");

		String name = filename.substring(0, index);
		String ext = filename.substring(index + 1);

		System.out.println("filename : " + filename);
		System.out.println("파일명 : " + name);
		System.out.println("확장자 : " + ext);
	}

}
