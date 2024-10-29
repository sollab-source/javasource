package ch01.object;

class Test {
	int x;
}

public class EqualsEx1 {
	public static void main(String[] args) {

		Test t1 = new Test();
		Test t2 = new Test();

		System.out.println("hashCode 비교 : " + (t1.hashCode() == t2.hashCode()));
		System.out.println("t1.equals(t2) : " + t1.equals(t2));

	}

}
