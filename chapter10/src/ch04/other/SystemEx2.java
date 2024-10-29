package ch04.other;

public class SystemEx2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
			System.out.println(i);
			
			if (i == 7) {
				// JVM프로세스 종료
				System.out.println("프로세스 종료");
				System.exit(0);
			}
		}
	}
}
