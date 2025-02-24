package ch04.soldeskmemberEx03;

public class SolDeskMember {

	private int memberId;
	private String memberName;

	public SolDeskMember() {
	}

	public SolDeskMember(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	// getter and setter
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	// 물리적인 값(시스템 주소)
	@Override
	public int hashCode() {
		return memberId;
	}

	// 논리값(내용)
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SolDeskMember) {
			SolDeskMember member = (SolDeskMember) obj;
			return this.memberId == member.memberId || this.memberName.equals(member.memberName);
		}
		return false;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
}