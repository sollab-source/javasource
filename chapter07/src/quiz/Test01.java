package quiz;

public class Test01 {
	public static void main(String[] args) {
		Child child = new Child();

		// 부모 메소드 호출 (오버라이딩된 메소드)
		child.parentMethod();

		// 자식 고유 메소드 호출
		child.childMethod();
	}
}