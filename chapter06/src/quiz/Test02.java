package quiz;

public class Test02 {

	public static void main(String[] args) {

		Book book1 = new Book("자바 프로그래밍");

		Book book2 = new Book("데이터베이스 기초", "홍길동");

		System.out.println("책 제목: " + book1.title + ", 저자: " + book1.author);
		System.out.println("책 제목: " + book2.title + ", 저자: " + book2.author);
	}
}
