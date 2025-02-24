package quiz.answer;

@SuppressWarnings("serial")
class NameNullOrEmptyException extends Exception {
	NameNullOrEmptyException() {
		super("이름을 입력해야합니다.");
	}
}

@SuppressWarnings("serial")
class KidSizeException extends Exception {
	KidSizeException() {
		super("주민등록번호는 13자리 숫자만 입력해야합니다.");
	}
}

public class Test04 {

	private String koreanId;
	private String name;

	public String getKoreanId() {
		return koreanId;
	}

	public String getName() {
		return name;
	}

	public void setKorean(String koreanId, String name) throws NameNullOrEmptyException, KidSizeException {
		if (name == null || name.trim() == "") {
			throw new NameNullOrEmptyException();
		}
		if (!koreanId.matches("[0-9]{13}")) {
			throw new KidSizeException();
		}
		this.koreanId = koreanId;
		this.name = name;
		System.out.printf("%s : %s님 저장되었습니다.", koreanId, name);
	}

	public static void main(String[] args) {

		Test04 kor1 = new Test04();

		try {
			kor1.setKorean("0201013041abcd", "솔데스크");
		} catch (NameNullOrEmptyException e) {
			System.out.println(e.getMessage());
		} catch (KidSizeException e) {
			System.out.println(e.getMessage());
		}
	}
}