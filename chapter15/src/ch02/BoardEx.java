package ch02;

import java.util.Scanner;

public class BoardEx {
	
	//사용자 입력을 받기 위한 Scanner 생성
	private Scanner sc = new Scanner(System.in);

	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-----------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no","writer","date","title");
		System.out.println("-----------------------------------------------");
		// 추후 실제 데이터가 출력될 부분
		System.out.printf("%-6s%-12s%-16s%-40s\n", "1","winter","2024-10-05","겨울이 옵니다.");
		System.out.println();
		System.out.println();		
		mainMenu();		
	}
	
	public void create() {
		System.out.println("create 실행");
	}
	public void read() {
		System.out.println("read 실행");
	}
	public void clear() {
		System.out.println("clear 실행");
	}
	public void exit() {
		System.out.println("exit 실행");
	}
	
	public void mainMenu() {
		System.out.println();
		System.out.println("[메인메뉴]");
		System.out.println("-----------------------------------------------");
		System.out.println("1. Create | 2. Read | 3. Clear | 4. Exit");
		System.out.println("-----------------------------------------------");
		System.out.print("메뉴 선택 >> ");
		int menu = Integer.parseInt(sc.nextLine());
		
		System.out.println();
		
		switch(menu) {
		case 1 -> create();
		case 2 -> read();
		case 3 -> clear();
		case 4 -> exit();
		}
	}	
	
	public static void main(String[] args) {
		BoardEx board = new BoardEx();
		board.list();
	}
}


