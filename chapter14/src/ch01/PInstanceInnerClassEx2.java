package ch01;

class Bag2 {

	private String name;
	private Long price;
	
	// 내부 클래스 참조 변수 선언
	private Pouch2 pouch;  

	public Bag2(String name, Long price) {
		this.name = name;
		this.price = price;
		
		pouch = new Pouch2("Shiny Grained", "light gray");
	}

	class Pouch2 {
		private String pouchName;
		private String color;

		// JDK16 부터 가능
		static int k = 5;
		static final int cost = 5000;
		
		public Pouch2(String pouchName, String color) {
			this.pouchName = pouchName;
			this.color = color;
		}

		public void printMember() {
			// 외부 클래스의 멤버 필드 사용
			System.out.println("name = " + name);
			System.out.println("price = " + price);

			// 내부 클래스의 멤버 필드 사용
			System.out.println("pouchName = " + pouchName);
			System.out.println("color = " + color);			
		}
		
		// JDK16 부터 가능
		public static void printStatic() {			
			System.out.println("k = " + k);
			System.out.println("cost = " + cost);
		}
	}// 인스턴스 내부 클래스 종료
	
	public void usingInnerClassMethod() {
		pouch.printMember();
	}
}

public class PInstanceInnerClassEx2 {
	public static void main(String[] args) {
		Bag bag = new Bag("chanel", 100000L);
		bag.usingInnerClassMethod();		
	}
}
