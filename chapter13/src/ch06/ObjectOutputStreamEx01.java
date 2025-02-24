package ch06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Serializable : 직렬화(네트웍을 통해 바이너리로 형변환하여 전송)
class Person implements Serializable {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age;
	}
}

public class ObjectOutputStreamEx01 {

	public static void main(String[] args) {
		String filePath = "person.dat"; // 데이터 파일 경로

		// ObjectOutputStream을 사용하여 객체 쓰기
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(filePath))) {
			Person person = new Person("솔데스크", 15);
			oos.writeObject(person); // 객체를 직렬화하여 파일에 저장
			System.out.println("객체가 성공적으로 저장되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}