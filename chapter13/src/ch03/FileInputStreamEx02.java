package ch03;

import java.io.FileInputStream;

public class FileInputStreamEx02 {

	public static void main(String[] args) {
		// 파일 경로 설정
		String filePath = "outputstream.txt";

		// FileInputStream을 사용하여 파일에서 데이터 읽기
		try (FileInputStream fis = new FileInputStream(filePath)) {
			int byteData;
			System.out.println("파일 내용:");

			// 파일에서 데이터를 한바이트씩 읽기
			while ((byteData = fis.read()) != -1) {
				System.out.print((char) byteData);
			}
		} catch (Exception e) {
			System.out.println("파일을 쓰는 도중 오류 발생: " + e.getMessage());
		}
	}
}