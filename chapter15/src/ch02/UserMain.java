package ch02;

import java.util.Scanner;

public class UserMain {

	// 사용자 입력을 받기 위한 Scanner 생성
	private Scanner sc = new Scanner(System.in);
	// 데이터베이스 작업을 위한 인스턴스 생성
	private UserDAO dao = new UserDAO();

	public static void main(String[] args) {
		UserMain main = new UserMain();
		main.start();
	}

	public void start() {

		while (true) {

			System.out.println();
			System.out.println("[메인메뉴] User");
			System.out.println("------------------------------------------------------");
			System.out.println("1. Create | 2. Read | 3. Remove | 4. Update | 5. Exit");
			System.out.println("------------------------------------------------------");
			System.out.print("메뉴 선택 >> ");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1 -> userCreate();
			case 2 -> userRead();
			case 3 -> userRemove();
			case 4 -> userUpdate();
			case 5 -> System.exit(0);
			}
		}
	}

	public void userRead() {
//		System.out.println("특정 user 조회");
		
	}

	public void userCreate() {
		System.out.println("user 정보 추가");
	}

	public void userUpdate() {
		System.out.println("특정 user 정보 수정");
	}

	public void userRemove() {
		System.out.println("특정 user 정보 삭제");
	}
}
