package quiz;

import java.util.List;
import java.util.Scanner;

public class TodoEx {

	// 사용자 입력을 받기 위한 Scanner 생성
	private Scanner sc = new Scanner(System.in);
	// 데이터베이스 작업을 위한 인스턴스 생성
	private TodoDAO dao = new TodoDAO();

	public void list() {
		// 전체 todo 조회
		List<TodoDTO> list = dao.getRows();

		System.out.println();
		System.out.println("[todo 전체목록]");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.printf("%-6s%-45s%-20s%-12s\n", "no", "title", "writer", "regdate");
		System.out.println("------------------------------------------------------------------------------------");

		for (TodoDTO boardDto : list) {
			System.out.printf("%-6s%-40s%-20s%-12s\n", boardDto.getBno(), boardDto.getTitle(), boardDto.getWriter(),
					boardDto.getRegDate());
		}
		System.out.println();
		mainMenu();
	}

	public void create() {
		// 새 todo 등록
	}

	public void read() {
		// todo 조회
	}

	public void delete(int bno) {
		// todo 삭제
	}

	public void update(int bno) {
		// todo 수정

	}

	public void clear() {
		// todo 전체 삭제
	}

	public void mainMenu() {
		// 메뉴화면
		while (true) {

			System.out.println();
			System.out.println("[TODO]");
			System.out.println("-----------------------------------------------");
			System.out.println("1. Create | 2. Read | 3. List | 4. Exit");
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
		TodoEx todo = new TodoEx();
		todo.list();
	}
}
