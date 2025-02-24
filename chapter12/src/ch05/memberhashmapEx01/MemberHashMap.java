package ch05.memberhashmapEx01;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, String> hashMap;

	public MemberHashMap() {
		hashMap = new HashMap<Integer, String>();
	}

	// addMember
	// chapter13.list.memberEx03.Member 사용
	public void addMember(Member member) {
		hashMap.put(member.memberId(), member.memberName());
	}

	// removeMember
	public boolean removeMember(int memberId) {
		while (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	// showAllMember
	public void showAllMember() {
		// Map 구조에서 Key만 ir에 저장함
		Iterator<Integer> ir = hashMap.keySet().iterator();// 순환구조

		while (ir.hasNext()) { // Key 존재여부
			int key = ir.next();
			String member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}