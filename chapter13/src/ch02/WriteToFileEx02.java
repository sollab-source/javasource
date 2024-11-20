package ch02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriteToFileEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("파일에 저장할 내용을 입력하세요: ");
		String content = scan.nextLine();

		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter("output.txt"))) {
			writer.write(content);
			System.out.println("내용이 파일에 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일을 쓰는 도중 오류 발생: " + e.getMessage());
		} finally {
			scan.close();
		}
	}
}