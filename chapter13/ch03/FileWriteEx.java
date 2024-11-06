package ch03;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteEx {
    public static void main(String[] args) {
        // 파일 경로 설정
        String filePath = "output.txt";
        String data = "Hello, this is a test of FileOutputStream.";

        // FileOutputStream을 사용하여 파일에 데이터 쓰기
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // 문자열 데이터를 바이트 배열로 변환하여 파일에 저장
            fos.write(data.getBytes());
            System.out.println("파일에 데이터가 성공적으로 저장되었습니다.");
        } catch (IOException e) {
            System.err.println("파일을 쓰는 도중 오류 발생: " + e.getMessage());
        }
    }
}

