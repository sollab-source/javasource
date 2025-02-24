package ch01.object;

class Value1 {
	int x;
}

class Value2 {
	int x;

// toString() 오버라이딩 : 객체에 저장된 값 표현
	@Override
	public String toString() {
		return "x : " + x;
	}
}

public class ToStringEx1 {
	public static void main(String[] args) {
		Value1 v1 = new Value1();
		v1.x = 10;
		System.out.println("v1 : " + v1.toString());

		Value2 v2 = new Value2();
		v2.x = 10;
		// 오버라이딩 된 toString() 호출
		System.out.println("v2 : " + v2.toString());
		// 참조변수 출력시 toString() 호출, 반환값 출력
		System.out.println("v2 : " + v2);
	}
}
