package quiz;


class Bag {

	private String name;
	private Long price;

	public Bag(String name, Long price) {
		this.name = name;
		this.price = price;
	}

	class Pouch {
		private String pouchName;
		private String color;		
		
		static int k = 5;		
		static final int cost = 5000;		

		public Pouch(String pouchName, String color) {
			super();
			this.pouchName = pouchName;
			this.color = color;
		}
		
		public void printMember() {
			// 외부 클래스의 멤버에 접근 가능 
			System.out.println("Bag name = " + name);
			// 외부 클래스의 멤버에 접근 가능 
			System.out.println("Bag price = " + price);

			// 내부 클래스의 멤버 사용
			System.out.println("pouchName = " + pouchName); 
			System.out.println("color = " + color); 
		}		
	}
}
public class BagEx {

	public static void main(String[] args) {
		Bag bag = new Bag("chanel",100000L);
		
		//inner 클래스의 경우에는 직접 객체 생성 불가
		//Pouch pouch = new Pouch();
		
		Bag.Pouch p = bag.new Pouch("channel pouch","blue");
		p.printMember();	
		
		// Pouch 가 가지고 있는 static 접근
		System.out.println(Bag.Pouch.k);
	}
}