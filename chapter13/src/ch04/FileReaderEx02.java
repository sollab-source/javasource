package ch04;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderEx02 {

	public static void main(String[] args) {

		String filePath = "example.txt";
		// FileReader로 읽고 BufferedReader로 감싸기
		try (FileReader fr = new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			while ((line = br.readLine()) != null) { // 파일에서 한 줄씩 읽기
				System.out.println(line); // 읽은 줄 출력
			}
		} catch (Exception e) {
			System.err.println("파일 읽기 중 오류 발생: " + e.getMessage());
		}
	}
}