package ch02;

import java.util.List;
import java.util.Scanner;

public class BoardEx {

	// 사용자 입력을 받기 위한 Scanner 생성
	private Scanner sc = new Scanner(System.in);
	// 데이터베이스 작업을 위한 인스턴스 생성
	private BoardDAO dao = new BoardDAO();

	public void list() {
		// 전체 게시물 조회		
		mainMenu();
	}

	public void create() {
		// 새 게시물 등록
	}

	public void read() {
		// 게시물 조회
	}

	public void delete(int bno) {
		// 게시물 삭제
	}

	public void update(int bno) {
		// 게시물 수정

	}

	public void clear() {
		// 게시물 전체 삭제
	}

	public void mainMenu() {
		// 메뉴화면		
	}

	public static void main(String[] args) {
		BoardEx board = new BoardEx();
		board.list();
	}
}
