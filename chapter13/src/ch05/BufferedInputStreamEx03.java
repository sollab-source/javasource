package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamEx03 {

	public static void main(String[] args) {
		String filePath = "buffered_input.dat";

		// BufferedOutputStream을 사용하여 데이터 쓰기
		try (BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(filePath))) {
			bos.write("Hello, Buffered!".getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// BufferedInputStream을 사용하여 데이터 읽기
		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(filePath))) {
			byte[] buffer = new byte[1024];
			int bytesRead = bis.read(buffer);
			String message = new String(buffer, 0, bytesRead);

			System.out.println("읽은 데이터: " + message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
