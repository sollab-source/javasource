package ch03.castingEx03;

public class CastingMain {
	
	public static void main(String[] args) {

		// 묵시적 형 변환
		Parent p = new Child();

		// 부모의 요소
		System.out.println(p.parentField);

		// 다형성을 위해 재정의된 자식에서 재정의된 메소드
		p.parentMethod();

		/*
		 p는 부모 타입으로 변환되었으므로 자식 클래스의 멤버에는 접근 불가 
		 System.out.println(p.childField);
		 p.childMethod();
		 */

		// 명시적 형 변환
		Child c = (Child) p;

		// 자식의 멤버 접근
		System.out.println(c.childField);
		c.childMethod();
	}
}