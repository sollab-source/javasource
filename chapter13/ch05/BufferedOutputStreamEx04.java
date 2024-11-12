package ch05;

import java.io.*;

public class BufferedOutputStreamEx04 {
    public static void main(String[] args) {
        String filePath = "buffered_output.dat"; // 데이터 파일 경로

        // BufferedOutputStream을 사용하여 데이터 쓰기
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            bos.write("Buffered Output Example".getBytes());
            bos.flush(); // 버퍼의 내용을 강제로 출력
        } catch (IOException e) {
            e.printStackTrace();
        }       
        System.out.println("파일에 데이터가 성공적으로 저장되었습니다.");
    }
}

