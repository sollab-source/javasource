package ch05;

import java.io.*;

public class DataOutputStreamEx02 {
    public static void main(String[] args) {
        String filePath = "output.dat"; // 데이터 파일 경로

        // DataOutputStream을 사용하여 데이터 쓰기
        try (DataOutputStream dos = new DataOutputStream(
        		new FileOutputStream(filePath))) {
            dos.writeInt(123);
            dos.writeDouble(456.78);
            dos.writeUTF("Output Example");
        } catch (IOException e) {
            e.printStackTrace();
        }      
        System.out.println("파일에 데이터가 성공적으로 저장되었습니다.");
    }
}