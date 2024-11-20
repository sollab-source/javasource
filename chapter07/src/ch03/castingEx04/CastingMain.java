package ch03.castingEx04;

public class CastingMain {

	public static void main(String[] args) {
		/*
		 Parent p = new Parent(); 
		 Child c = (Child)p;//컴파일 오류가 발생하지 않음 => 런타임오류
		 */
		Parent p = new Parent();
		boolean result1 = (p) instanceof Child;

		System.out.println("부모로 선언한 부모 객체 : " + result1);

		Parent c = new Child();
		boolean result2 = (c) instanceof Child;
		System.out.println("부모로 선언한 자식 객체 : " + result2);
	}
}