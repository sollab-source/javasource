package ch04.soldeskmemberEx03;

public class SolDeskMemberMain {

	public static void main(String[] args) {

		// SolDeskMemberManager 객체 생성
		SolDeskMemberManager manager = new SolDeskMemberManager();

		// 회원 객체 생성
		SolDeskMember member1 = new SolDeskMember(1001, "이수정");
		SolDeskMember member2 = new SolDeskMember(1002, "박진영");
		SolDeskMember member3 = new SolDeskMember(1003, "정하나");
		SolDeskMember member4 = new SolDeskMember(1004, "김우진");

		// 회원가입
		manager.addMember(member1);
		manager.addMember(member2);
		manager.addMember(member3);
		manager.addMember(member4);
		System.out.println();

		// 전체 회원 목록
		System.out.println("====전체 회원 목록====");
		manager.showAllMember();

		// 중복 회원 추가 시도
		SolDeskMember duplicateMember = new SolDeskMember(1003, "정하나");
		manager.addMember(duplicateMember);

		// 전체 회원 목록
		System.out.println("====전체 회원 목록====");
		manager.showAllMember();
	}
}