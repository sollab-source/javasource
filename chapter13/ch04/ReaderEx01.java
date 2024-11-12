package ch04;

import java.io.*;

public class ReaderEx01 {
    public static void main(String[] args) {
        String text = "Hello, this is a test string.";
        Reader reader = new StringReader(text); // 문자열을 읽기 위한 Reader 생성

        try {
            int data;
            while ((data = reader.read()) != -1) { // 한 문자씩 읽기
                System.out.print((char) data); // 읽은 문자를 출력
            }
        } catch (IOException e) {
            System.err.println("읽기 중 오류 발생: " + e.getMessage());
        } finally {
            try {
                reader.close(); // Reader 닫기
            } catch (IOException e) {
                System.err.println("닫기 중 오류 발생: " + e.getMessage());
            }
        }
    }
}

