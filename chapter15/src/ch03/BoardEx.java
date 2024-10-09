package ch03;

import java.util.List;
import java.util.Scanner;

public class BoardEx {

	// 사용자 입력을 받기 위한 Scanner 생성
	private Scanner sc = new Scanner(System.in);
	// 데이터베이스 작업을 위한 인스턴스 생성
	private BoardDAO dao = new BoardDAO();

	public void list() {
		// 전체 게시물 조회
		List<BoardDTO> list = dao.getRows();

		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.printf("%-6s%-40s%-20s%-12s\n", "no", "title", "writer", "regdate");
		System.out.println("------------------------------------------------------------------------------------");

		for (BoardDTO boardDto : list) {
			System.out.printf("%-6s%-35s%-20s%-12s\n", boardDto.getBno(), boardDto.getTitle(), boardDto.getWriter(),
					boardDto.getRegDate());
		}
		System.out.println();
		mainMenu();
	}

	public void create() {
		// 새 게시물 등록
		System.out.println();
		System.out.println("[새 게시물 등록]");
		System.out.print("제  목 : ");
		String title = sc.nextLine();
		System.out.print("내  용 : ");
		String content = sc.nextLine();
		System.out.print("작성자 : ");
		String writer = sc.nextLine();

		BoardDTO insertDto = new BoardDTO();
		insertDto.setTitle(title);
		insertDto.setContent(content);
		insertDto.setWriter(writer);

		int result = dao.create(insertDto);
		if (result > 0) {
			System.out.println();
			System.out.println("입력 성공");
		} else {
			System.out.println("입력 실패");
		}
		list();
	}

	public void read() {
		// 특정 게시물 조회
		System.out.println();
		System.out.println("[게시물 읽기]");
		System.out.print("bno 입력 : ");
		int bno = Integer.parseInt(sc.nextLine());

		BoardDTO readDto = dao.getRow(bno);

		System.out.println("----------------------------------");
		System.out.printf("번호 : %d\n", readDto.getBno());
		System.out.printf("제목 : %s\n", readDto.getTitle());
		System.out.printf("내용 : %s\n", readDto.getContent());
		System.out.printf("작성자 : %s\n", readDto.getWriter());
		System.out.printf("날짜 : %s\n", readDto.getRegDate());
		System.out.println("----------------------------------");
		System.out.println();

		// 보조 메뉴 추가
		System.out.println("보조 메뉴 : 1. Update | 2. Delete | 3. List");
		System.out.print("메뉴 선택 >> ");
		int menu = Integer.parseInt(sc.nextLine());

		// 이전 코드 동일

		if (menu == 1) {
			update(bno);
		} else if (menu == 2) {
			delete(bno);
		}
		// 게시물 목록 출력
		list();
	}

	public void delete(int bno) {
		System.out.println(dao.deleteRow(bno) == 1 ? "삭제 성공" : "삭제 실패");
		System.out.println();
		list();
	}

	public void update(int bno) {
		// 수정 내용 입력 받기
		BoardDTO updateDto = new BoardDTO();
		updateDto.setBno(bno);
		System.out.print("제목 : ");
		updateDto.setTitle(sc.nextLine());
		System.out.print("내용 : ");
		updateDto.setContent(sc.nextLine());

		System.out.println(dao.updateRow(updateDto) == 1 ? "수정 성공" : "수정 실패");
		System.out.println();
		list();
	}

	public void clear() {
		// 게시물 전체 삭제 기능
		System.out.println("게시물이 전체 삭제 됩니다. 정말로 삭제하시겠습니까? ");
		System.out.println("---------------------------------------------------------");
		System.out.println("1. OK | 2. Cancel");
		System.out.print("메뉴 선택 >> ");
		int menu = Integer.parseInt(sc.nextLine());

		if (menu == 1) {
			dao.deleteAll();
		}
		
		list();
	}

	public void mainMenu() {

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
		BoardEx board = new BoardEx();
		board.list();
	}
}
