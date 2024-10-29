package ch10.object;

class Test2 {

	int x;

	// x의 값이 같은 경우 같은 객체, 다른 경우 다른 객체
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Test2) {
			return x == ((Test2) obj).x;
		}
		return false;// 현재 타입이 아닌 다른 타입과 비교 X
	}

	// 객체의 hashcode값이 같은 경우 같은 객체, 다른 경우 다른 객체
	@Override
	public int hashCode() {
		return x;
	}

}

public class EqualsEx2 {

	public static void main(String[] args) {
		Test2 t1 = new Test2();
		Test2 t2 = new Test2();
		
		t1.x = 10;
		t2.x = 10;
		
		System.out.println("hashcode 비교 : "+ (t1.hashCode() == t2.hashCode()));
		System.out.println("t1.equals(t2) : " +t1.equals(t2));
	
		
		
	}

}
