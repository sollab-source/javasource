package chapter13.ch03.bookEx03;

public class BookArrayListMain {

	public static void main(String[] args) {

		// BookArrayListEx02 객체 생성
		BookArrayList bookArrayList = new BookArrayList();

		// 책생성
		Book book1 = new Book(1001, "자바의 이해");
		Book book2 = new Book(1002, "SolDesk Python");
		Book book3 = new Book(1003, "SolDesk Java");
		Book book4 = new Book(1004, "클린 코드");

		// 책추가
		bookArrayList.addBook(book1);
		bookArrayList.addBook(book2);
		bookArrayList.addBook(book3);
		bookArrayList.addBook(book4);

		// 모든 책 정보 출력
		System.out.println("===전체 책 목록===");
		bookArrayList.showAllBooks();

		// 책삭제
		System.out.println("===클린코드 책 삭제===");
		bookArrayList.removeBook(book4.bookId());

		// 삭제 후 책정보
		bookArrayList.showAllBooks();
	}
}
