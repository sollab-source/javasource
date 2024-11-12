package ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {
    public static void main(String[] args) {
        // 원본 및 복사 파일 경로 설정
        String sourceFile = "IOStream.txt";
        String destFile = "copy.txt";

        // BufferedInputStream과 BufferedOutputStream을 사용하여 파일 복사
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {
             
            byte[] buffer = new byte[1024]; // 1KB 버퍼
            int bytesRead;

            // 원본 파일에서 데이터를 읽어 복사 파일에 쓰기
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("파일이 성공적으로 복사되었습니다.");
        } catch (IOException e) {
            System.err.println("파일 복사 중 오류 발생: " + e.getMessage());
        }
    }
}

