package quiz;

public class Book {

    String title;
    String author;

    // 제목만 받는 생성자
    public Book(String title) {
        this.title = title;
        this.author = "작자 미상";
    }

    // 제목과 저자를 모두 받는 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}