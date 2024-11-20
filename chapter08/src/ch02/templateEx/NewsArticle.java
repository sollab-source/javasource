package ch02.templateEx;

public class NewsArticle extends Document {
	@Override
	public void writeTitle() {
		System.out.println("뉴스 기사 제목을 작성합니다.");
	}

	@Override
	public void writeText() {
		System.out.println("뉴스 기사를 작성합니다");
	}

	@Override
	public void save() {
		System.out.println("뉴스 기사를 저장합니다.");
	}
}