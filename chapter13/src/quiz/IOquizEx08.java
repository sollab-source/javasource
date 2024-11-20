package quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class IOquizEx08 {

	public static void main(String[] args) {

		Person person = new Person("Alice", 30);

		// 직렬화
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("person.ser"))) {
			oos.writeObject(person); // 여기를 채움
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 역직렬화
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("person.ser"))) {
			Person savedPerson = (Person) ois.readObject(); // 여기를 채움
			System.out.println("Name: " + savedPerson.name
					+ ", Age: " + savedPerson.age);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}