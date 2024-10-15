package ch01;

public class BagTest {

	private String name;
	private Long price;

	public BagTest(String name, Long price) {
		this.name = name;
		this.price = price;
	}

	class Pouch {
		private String pouchName;
		private String color;

		//https://docs.oracle.com/javase/specs/jls/se16/preview/specs/local-statics-jls.html
		//https://bugs.openjdk.org/browse/JDK-8254321
		// static 멤버 사용 불가
		static int k = 5;
		// 하지만 상수인 final static은 사용 가능
		static final int cost = 5000;

		public void printMember() {
			// 외부 클래스의 멤버에 접근 가능 ( private 여도 같은 클래스 내에서 접근하므로 ok )
			System.out.println("name = " + name);
			// 외부 클래스의 멤버에 접근 가능 ( private 여도 같은 클래스 내에서 접근하므로 ok )
			System.out.println("price = " + price);

			// 내부 클래스의 멤버 사용
			System.out.println("pouchName = " + pouchName); 
			System.out.println("color = " + color); 
		}
		
		public static void test() {}
	}
}
