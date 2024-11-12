package chapter13.ch05.memberhashmapEx01;



public class MemberHashMapMain {

	public static void main(String[] args) {

		MemberHashMap memberHashMap=new MemberHashMap();
		
		//입력할때 필요한 매개변수 객체 생성
		Member memberLee=new Member(1001, "이수정");
		Member memberPark=new Member(1002, "박진영");
		Member memberKim=new Member(1003, "김우진");
		Member memberJung=new Member(1004, "정하나");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberJung);
		memberHashMap.addMember(new Member(1005, "이민정"));
		memberHashMap.addMember(new Member(1005, "임민정"));
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1002);
		memberHashMap.showAllMember();

	}

}
