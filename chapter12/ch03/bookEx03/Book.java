package chapter13.ch03.bookEx03;

public record Book(int bookId, String bookTitle) {
	
    // toString 메서드는 기본적으로 자동 생성되지만, 필요하면 커스터마이징할 수 있다.
    @Override
    public String toString() {
        return "책제목: " + bookTitle + " (ID: " + bookId + ")";
    }
}