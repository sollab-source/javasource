package quiz;

import java.util.List;
import java.util.Scanner;

import ch03.BoardDTO;

public class ProductEx {

	// 사용자 입력을 받기 위한 Scanner 생성
	private Scanner sc = new Scanner(System.in);
	// 데이터베이스 작업을 위한 인스턴스 생성
	private ProductDAO dao = new ProductDAO();

	public void list() {
		// 전체 todo 조회
		List<ProductDTO> list = dao.getProducts();

		System.out.println();
		System.out.println("[상품전체목록]");
		System.out.println("------------------------------------------------------");
		System.out.printf("%s%10s%10s%10s\n", "상품번호", "상품명", "가격", "수량");
		System.out.println("------------------------------------------------------");

		for (ProductDTO product : list) {
			System.out.printf("%4d%15s%12d%12d\n", product.getPid(), product.getName(), product.getPrice(),
					product.getQuantity());
		}
		System.out.println();
		mainMenu();
	}

	public void create() {
		// 새 todo 등록
		System.out.println();
		ProductDTO product = new ProductDTO();
		System.out.println("[상품 입력]");
		System.out.println("-----------------------------");
		System.out.print("상품명 : ");
		product.setName(sc.nextLine());
		System.out.print("가격 : ");
		product.setPrice(Integer.parseInt(sc.nextLine()));
		System.out.print("수량 : ");
		product.setQuantity(Integer.parseInt(sc.nextLine()));

		int result = dao.create(product);
		if (result > 0) {
			System.out.println();
			System.out.println("입력 성공");
		} else {
			System.out.println("입력 실패");
		}
		// 게시물 목록 출력
		list();
	}

	public void read() {
		// todo 조회
		System.out.println();
		System.out.print("조회할 상품번호 : ");
		int pid = Integer.parseInt(sc.nextLine());

		ProductDTO product = dao.getProduct(pid);

		System.out.println();
		System.out.println("[상품 조회]");
		System.out.println("------------------------------------------------------");
		System.out.printf("%s%10s%10s%10s\n", "상품번호", "상품명", "가격", "수량");
		System.out.println("------------------------------------------------------");
		System.out.printf("%4d%15s%12d%12d\n", product.getPid(), product.getName(), product.getPrice(),
				product.getQuantity());
		System.out.println();
		// 보조 메뉴 추가
		System.out.println("보조 메뉴 : 1. Update | 2. Delete | 3. List");
		System.out.print("메뉴 선택 >> ");
		int menu = Integer.parseInt(sc.nextLine());

		if (menu == 1) {
			update(pid);
		} else if (menu == 2) {
			delete(pid);
		}
		// 게시물 목록 출력
		list();

	}

	public void delete(int pid) {
		// product 삭제
		System.out.println(dao.delete(pid) == 1 ? "삭제 성공" : "삭제 실패");
		System.out.println();
		list();
	}

	public void update(int pid) {
		// product 수정
		ProductDTO updateDto = new ProductDTO();
		updateDto.setPid(pid);
		System.out.print("수량 : ");
		updateDto.setQuantity(Integer.parseInt(sc.nextLine()));

		System.out.println(dao.update(updateDto) == 1 ? "수정 성공" : "수정 실패");
		System.out.println();
		list();
	}

	public void mainMenu() {
		// 메뉴화면
		while (true) {

			System.out.println();
			System.out.println("[메뉴]");
			System.out.println("------------------------------------------------------");
			System.out.println("1. 상품 생성 | 2. 상품 조회 | 3. Exit");
			System.out.println("------------------------------------------------------");
			System.out.print("메뉴 선택 >> ");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1 -> create();
			case 2 -> read();
			case 3 -> System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		ProductEx todo = new ProductEx();
		todo.list();
	}
}