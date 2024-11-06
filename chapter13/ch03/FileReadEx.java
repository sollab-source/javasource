package ch03;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadEx {
    public static void main(String[] args) {
        // 파일 경로 설정
        String filePath = "output.txt";

        // FileInputStream을 사용하여 파일에서 데이터 읽기
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;
            System.out.println("파일 내용:");

            // 파일에서 데이터를 한 바이트씩 읽기
            while ((byteData = fis.read()) != -1) {
                // 읽은 바이트 데이터를 출력
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.err.println("파일을 읽는 도중 오류 발생: " + e.getMessage());
        }
    }
}

