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
		
		// 파우치 가격
		
		// 파우치 이름		

		public void info() {
			// 가방 정보 출력
			
		}
	}
}

public class QuizEx05 {

	public static void main(String[] args) {
		Bag bag = new Bag("chanel", 100000L);

		Bag.Pouch p = bag.new Pouch("blue");
		p.info();
	}
}