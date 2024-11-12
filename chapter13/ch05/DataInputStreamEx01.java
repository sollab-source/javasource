package ch05;

import java.io.*;

public class DataInputStreamEx01 {
    public static void main(String[] args) {
        String filePath = "datastream.dat"; // 데이터 파일 경로

        // DataOutputStream을 사용하여 데이터 쓰기
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(42);
            dos.writeDouble(3.14);
            dos.writeUTF("Hello, Data!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // DataInputStream을 사용하여 데이터 읽기
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int number = dis.readInt();
            double decimal = dis.readDouble();
            String message = dis.readUTF();

            System.out.println("읽은 데이터:");
            System.out.println("정수: " + number);
            System.out.println("실수: " + decimal);
            System.out.println("문자열: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

