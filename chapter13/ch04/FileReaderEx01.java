package ch04;

import java.io.*;

public class FileReaderEx01 {
    public static void main(String[] args) {
        String filePath = "example.txt"; // 읽을 파일 경로

        try (FileReader fr = new FileReader(filePath); // FileReader 생성
             BufferedReader br = new BufferedReader(fr)) { // BufferedReader로 감싸기
            String line;
            while ((line = br.readLine()) != null) { // 파일에서 한 줄씩 읽기
                System.out.println(line); // 읽은 줄 출력
            }
        } catch (IOException e) {
            System.err.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
    }
}

