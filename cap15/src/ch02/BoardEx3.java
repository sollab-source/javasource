package ch02;

import java.util.List;
import java.util.Scanner;

public class BoardEx3 {

	// 사용자 입력을 받기 위한 Scanner 생성
	private Scanner sc = new Scanner(System.in);
	// 데이터베이스 작업을 위한 인스턴스 생성
	private BoardDAO dao = new BoardDAO();

	public void list() {

		// ................
		// 이전 코드 동일

		// 전체 목록 출력 코드 작성 영역		
		List<BoardDTO> list = dao.getRows();
		for (BoardDTO boardDto : list) {
			System.out.printf("%-6s%-40s%-20s%-12s\n", boardDto.getBno(), boardDto.getTitle(), boardDto.getWriter(),
					boardDto.getRegDate());
		}

		System.out.println();
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
		while (true) {

			System.out.println();
			System.out.println("[메인메뉴]");
			System.out.println("-----------------------------------------------");
			System.out.println("1. Create | 2. Read | 3. Clear | 4. Exit");
			System.out.println("-----------------------------------------------");
			System.out.print("메뉴 선택 >> ");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1 -> create();
			case 2 -> read();
			case 3 -> clear();
			case 4 -> System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		BoardEx3 board = new BoardEx3();
		board.list();
	}
}
