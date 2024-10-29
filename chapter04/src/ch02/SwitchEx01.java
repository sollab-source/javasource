package ch02;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		int day = 2;
		
		switch (day) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		default:
			System.out.println("주말");
		}
	}
}

