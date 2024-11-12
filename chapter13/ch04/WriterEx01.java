package ch04;

import java.io.*;

public class WriterEx01 {
    public static void main(String[] args) {
        String data = "Hello, this is a test of Writer."; // 쓸 데이터
        Writer writer = new StringWriter(); // StringWriter 객체 생성

        try {
            writer.write(data); // 데이터를 Writer에 쓰기
            writer.flush(); // 버퍼에 있는 데이터 강제로 출력
            System.out.println(writer.toString()); // StringWriter의 내용을 출력
        } catch (IOException e) {
            System.err.println("쓰기 중 오류 발생: " + e.getMessage());
        } finally {
            try {
                writer.close(); // Writer 닫기
            } catch (IOException e) {
                System.err.println("닫기 중 오류 발생: " + e.getMessage());
            }
        }
    }
}

