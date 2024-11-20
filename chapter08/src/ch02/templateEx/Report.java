package ch02.templateEx;

public class Report extends Document {
	@Override
	public void writeTitle() {
		System.out.println("보고서 제목을 작성합니다.");
	}

	@Override
	public void writeText() {
		System.out.println("보고서를 작성합니다..");
	}

	@Override
	public void save() {
		System.out.println("보고서를 저장합니다.");
	}
}