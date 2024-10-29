package ch02;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		int day = 2;
		
		switch (day) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			
		case 3:
			System.out.println("수요일");
			
		default:
			System.out.println("주말");
		}
	}
}

