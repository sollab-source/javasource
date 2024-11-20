package quiz;

public class Test03 {

	public static void main(String[] args) {
		// Rectangle 객체 생성
		Rectangle rectangle = new Rectangle();

		// 길이와 너비 설정
		rectangle.length = 10;
		rectangle.width = 10;

		// 면적 계산 및 출력
		int area = rectangle.calculateArea();
		System.out.println("면적: " + area);
	}
}
