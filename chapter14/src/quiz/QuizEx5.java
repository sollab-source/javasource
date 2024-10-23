package quiz;

class Bag {

	private String name;
	private Long price;

	public Bag(String name, Long price) {
		this.name = name;
		this.price = price;
	}

	class Pouch {
		
		// 파우치 색상
		private String color;
		// 파우치 가격
		static final int COST = 5000;
		// 파우치 이름
		static final String POUCH_NAME = "sunflower";

		public Pouch(String color) {
			super();
			this.color = color;
		}

		public void info() {
			// 외부 클래스의 멤버에 접근 가능
			System.out.println("Bag name = " + name);
			// 외부 클래스의 멤버에 접근 가능
			System.out.println("Bag price = " + price);

			System.out.println();

			// 내부 클래스의 멤버 사용
			System.out.println("PouchName = " + POUCH_NAME);
			System.out.println("Cost = " + COST);
			System.out.println("Color = " + color);
		}
	}
}

public class QuizEx5 {

	public static void main(String[] args) {
		Bag bag = new Bag("chanel", 100000L);

		// inner 클래스의 경우에는 직접 객체 생성 불가
		// Pouch pouch = new Pouch();

		Bag.Pouch p = bag.new Pouch("blue");
		p.info();
	}
}