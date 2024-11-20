package ch06;

import java.io.*;

class Book implements Serializable {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "제목: " + title + ", 저자: " + author;
	}
}

public class BufferedOutputStreamEx03 {
	public static void main(String[] args) {
		String filePath = "books.dat"; // 데이터 파일 경로

		// BufferedOutputStream과 ObjectOutputStream을 함께 사용하여 객체 쓰기
		try (BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(filePath));
				ObjectOutputStream oos = new ObjectOutputStream(bos)) {

			Book book = new Book("자바 프로그래밍", "홍길동");
			oos.writeObject(book); // 객체를 직렬화하여 파일에 저장
			System.out.println("객체가 성공적으로 저장되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}