package ch03;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopyEx02 {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt"; // 복사할 원본 파일 경로
        String destFilePathWithoutBuffer = "dest_without_buffer.txt"; // 버퍼 없이 복사할 파일 경로
        String destFilePathWithBuffer = "dest_with_buffer.txt"; // 버퍼를 사용하여 복사할 파일 경로

        // 원본 파일 생성 (예시: 10MB의 데이터 생성)
        createTestFile(sourceFilePath, 10 * 1024 * 1024); // 10MB 파일 생성

        // 버퍼를 사용하지 않고 파일 복사
        long startTime = System.nanoTime();
        copyWithoutBuffer(sourceFilePath, destFilePathWithoutBuffer);
        long endTime = System.nanoTime();
        long durationWithoutBuffer = endTime - startTime;
        System.out.println("버퍼 없이 복사 소요 시간: " + durationWithoutBuffer / 1_000_000 + " ms");

        // 버퍼를 사용하여 파일 복사
        startTime = System.nanoTime();
        copyWithBuffer(sourceFilePath, destFilePathWithBuffer);
        endTime = System.nanoTime();
        long durationWithBuffer = endTime - startTime;
        System.out.println("버퍼 사용하여 복사 소요 시간: " + durationWithBuffer / 1_000_000 + " ms");
    }

    // 원본 파일 생성 메소드
    private static void createTestFile(String filePath, int sizeInBytes) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            byte[] data = new byte[sizeInBytes];
            bos.write(data);
        } catch (IOException e) {
            System.err.println("파일 생성 중 오류 발생: " + e.getMessage());
        }
    }

    // 버퍼 없이 파일 복사
    private static void copyWithoutBuffer(String source, String dest) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            System.err.println("파일 복사 중 오류 발생: " + e.getMessage());
        }
    }

    // 버퍼를 사용하여 파일 복사
    private static void copyWithBuffer(String source, String dest) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[1024]; // 1KB 버퍼
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("파일 복사 중 오류 발생: " + e.getMessage());
        }
    }
}
