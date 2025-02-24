package ch02.templateEx;

public abstract class Document {

	// 템플릿 메소드
	public void createDocument() {
		writeTitle();// 제목 쓰기
		writeText();// 본문 쓰기
		save();// 문서저장하기
	}

	// 추상메소드(자식 클래스에서 구현)
	public abstract void writeTitle();

	public abstract void writeText();

	public abstract void save();
}