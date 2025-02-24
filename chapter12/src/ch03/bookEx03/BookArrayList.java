package ch03.bookEx03;

import java.util.ArrayList;
import java.util.Iterator;

public class BookArrayList {

	// ArrayList booklist
	private ArrayList<Book> bookList;

	public BookArrayList() {
		bookList = new ArrayList<Book>();
	}

	// 책 추가 메서드
	public void addBook(Book book) {
		bookList.add(book);
	}

	// 책 삭제 메서드
	public boolean removeBook(int bookId) {
		Iterator<Book> it = bookList.iterator();

		while (it.hasNext()) {
			Book book = it.next();
			int tempId = book.bookId();
			if (tempId == bookId) {
				bookList.remove(book);
				System.out.println("ID " + bookId + "번 책이 삭제되었습니다.");
				return true;
			}
		} // while
		System.out.println("ID " + bookId + "번 책이 존재하지 않습니다.");
		return false;
	}// removeBook

	// 모든 책 정보 출력 메서드
	public void showAllBooks() {

		for (Book book : bookList) {
			System.out.println(book);
		}
		System.out.println();
	}
}