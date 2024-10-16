package quiz;

class Bag3 {

	private String name;
	private Long price;
	
	// 내부 클래스 참조 변수 선언
	private Pouch3 pouch;  

	public Bag3(String name, Long price) {
		this.name = name;
		this.price = price;
		
		pouch = new Pouch3("Shiny Grained", "light gray");
	}

	class Pouch3 {
		private String pouchName;
		private String color;

		// JDK16 부터 가능
		static int k = 5;
		static final int cost = 5000;
		
		public Pouch3(String pouchName, String color) {
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

public class PInstanceInnerClassEx3 {
	public static void main(String[] args) {
		Bag3 bag = new Bag3("chanel", 100000L);
		bag.usingInnerClassMethod();
		

		// inner 클래스의 경우에는 직접 객체 생성 불가
		// Pouch pouch = new Pouch();

		//Bag3.Pouch p = bag.new Pouch();
		//p.printMember();

		//System.out.println(Pouch.k);
	}
}
