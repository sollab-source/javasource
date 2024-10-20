package ch01;

public class AnonyousClassEx1 {

	public static void main(String[] args) {

		System.out.println("Main Thread");
		
		// 익명 클래스
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.print(i+"\t");					
				}
			};
		};
		t.start();
	}
}
