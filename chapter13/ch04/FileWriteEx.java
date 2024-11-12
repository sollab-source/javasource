package ch04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class FileWriteEx {
    public static void main(String[] args) {
        // 파일 경로 설정
        String filePath = "output.txt";
        String data = "Hello, this is a test of FileWriter.";

        // FileWriter와 BufferedWriter를 사용하여 파일에 데이터 쓰기
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // 문자열 데이터를 파일에 저장
            bw.write(data);
            bw.newLine();  // 줄바꿈
            System.out.println("파일에 데이터가 성공적으로 저장되었습니다.");
        } catch (IOException e) {
            System.err.println("파일을 쓰는 도중 오류 발생: " + e.getMessage());
        }
    }
}

