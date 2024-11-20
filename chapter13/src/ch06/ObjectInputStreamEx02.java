package ch06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx02 {

	public static void main(String[] args) {
		String filePath = "person.dat"; // 데이터 파일 경로

		// ObjectInputStream을 사용하여 객체 읽기
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(filePath))) {
			// 파일에서 객체 복원(역직렬화)
			Person person = (Person) ois.readObject(); 
			System.out.println("읽은 객체: " + person);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}