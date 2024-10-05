package ch02;

public class BoardEx {

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
	
	public void mainMenu() {
		System.out.println();
		System.out.println("[메인메뉴]");
		System.out.println("-----------------------------------------------");
		System.out.println("1. Create | 2. Read | 3. Clear | 4. Exit");
		System.out.println("-----------------------------------------------");
		System.out.print("메뉴 선택 >> ");
		System.out.println();
	}	
	
	public static void main(String[] args) {
		BoardEx board = new BoardEx();
		board.list();
	}
}


