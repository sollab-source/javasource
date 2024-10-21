package quiz;

class Bag1 {

	private String name;
	private Long price;
	
	// 내부 클래스 참조 변수 선언
	private Pouch pouch;  

	public Bag1(String name, Long price) {
		this.name = name;
		this.price = price;
		
		pouch = new Pouch("Shiny Grained", "light gray");
	}

	// 인스턴스 내부 클래스 선언
	class Pouch {
		private String pouchName;
		private String color;		
		
		public Pouch(String pouchName, String color) {
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
	}// 인스턴스 내부 클래스 종료
	
	public void usingInnerClassMethod() {
		pouch.printMember();
	}
}

public class PInstanceInnerClassEx1 {
	public static void main(String[] args) {
		Bag1 bag = new Bag1("chanel", 100000L);
		bag.usingInnerClassMethod();		
	}
}
