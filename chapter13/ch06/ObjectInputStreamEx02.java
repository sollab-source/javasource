package ch06;

import java.io.*;

public class ObjectInputStreamEx02 {
    public static void main(String[] args) {
        String filePath = "person.dat"; // 데이터 파일 경로

        // ObjectInputStream을 사용하여 객체 읽기
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Person person = (Person) ois.readObject(); // 파일에서 객체 복원
            System.out.println("읽은 객체: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
