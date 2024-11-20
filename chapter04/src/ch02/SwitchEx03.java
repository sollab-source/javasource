package ch02;

public class SwitchEx03 {
	
	public static void main(String[] args) {
		
		int month = 5;
		
		String season = switch (month) {
		case 12, 1, 2 -> "Winter";
		case 3, 4, 5 -> "Spring";
		case 6, 7, 8 -> "Summer";
		case 9, 10, 11 -> "Autumn";
		default -> throw new IllegalArgumentException("Invalid month: "
				+ month);
		};
		
		System.out.println("계절은 : " + season);
	}
}