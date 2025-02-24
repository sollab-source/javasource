package ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx05 {

	public static void main(String[] args) {
		String sourceFilePath = "source01.txt"; // 복사할 원본 파일 경로
		// 버퍼 없이 복사할 파일 경로
		String destFilePathWithoutBuffer = "dest_without_buffer.txt"; 
		// 버퍼를 사용하여 복사할 파일 경로
		String destFilePathWithBuffer = "dest_with_buffer.txt"; 

		// 원본 파일 생성 코드(10MB의 데이터 생성)
		createTestFile(sourceFilePath, 1024 * 1024 * 10); // 10M

		// 버퍼를 사용하지 않고 파일 복사
		long startTime = System.nanoTime();// 복사 시작
		copyWithoutBuffer(sourceFilePath, destFilePathWithoutBuffer);// 복사중
		long endTime = System.nanoTime();// 복사 끝
		long durationWithoutBuffer = endTime - startTime;
		System.out.println("버퍼 없이 복사 소요 시간: "
				+ durationWithoutBuffer / 1_000_000 + "ms");

		// 버퍼를 사용하여 파일 복사
		startTime = System.nanoTime();// 복사 시작
		copyWithBuffer(sourceFilePath, destFilePathWithoutBuffer);// 복사중
		endTime = System.nanoTime();// 복사 끝
		long durationWithBuffer = endTime - startTime;
		System.out.println("버퍼 사용하여 복사 소요 시간: "
				+ durationWithBuffer / 1_000_000 + "ms");
	}

	// 원본파일 생성(createTestFile) 메서드 구현
	public static void createTestFile(String filePath, int sizeInBytes) {
		try (BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(filePath))) {
			byte[] data = new byte[sizeInBytes];
			bos.write(data);
		} catch (Exception e) {
			System.out.println("파일 생성 중 오류 발생: " + e.getMessage());
		}

	}// createTestFile

	// 버퍼 없이 파일 복사
	public static void copyWithoutBuffer(String source, String dest) {
		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(dest)) {
			int bytesData;
			// 원본 파일에서 데이터를 읽어 복사 파일에 쓰기
			while ((bytesData = fis.read()) != -1) {
				fos.write(bytesData);
			}
			System.out.println("파일이 성공적으로 복사되었습니다.");
		} catch (Exception e) {
			System.err.println("파일 복사 중 오류 발생: " + e.getMessage());
		}
	}// copyWithoutBuffer

	// 버퍼 사용하여 파일 복사
	public static void copyWithBuffer(String source, String dest) {
		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(source));
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(dest))) {

			// BufferedInputStream 사용시 용량지정 가능
			byte[] buffer = new byte[1024]; // 1KB 버퍼
			int bytesData;
			// 원본 파일에서 데이터를 읽어 복사 파일에 쓰기
			while ((bytesData = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesData);
			}
			System.out.println("파일이 성공적으로 복사되었습니다.");
		} catch (Exception e) {
			System.err.println("파일 복사 중 오류 발생: " + e.getMessage());
		}
	}
}