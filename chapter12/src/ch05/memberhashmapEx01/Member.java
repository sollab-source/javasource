package ch05.memberhashmapEx01;

public record Member(int memberId, String memberName) {

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
}