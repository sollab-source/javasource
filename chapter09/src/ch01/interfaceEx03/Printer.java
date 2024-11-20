package ch01.interfaceEx03;

public interface Printer {

    int MAX_PRINT_PAGES = 100; // 상수 멤버 변수

    void print(); // 추상 메소드

    default void showStatus(int printedPages) {
        System.out.println("총 인쇄 가능 페이지 수: " + MAX_PRINT_PAGES);
        if (printedPages > MAX_PRINT_PAGES) {
            System.out.println("용지 부족: 남은 인쇄 가능 페이지 수를 초과했습니다.");
        } else {
            System.out.println("현재 인쇄한 페이지 수: " + printedPages);
            System.out.println("남은 인쇄 가능 페이지 수: "
            		+ (MAX_PRINT_PAGES - printedPages));
        }
        print(); // 추상 메소드 호출
    }
}