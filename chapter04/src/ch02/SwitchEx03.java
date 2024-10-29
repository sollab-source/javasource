package ch02;

public class SwitchEx03 {
	
	public static void main(String[] args) {
		
        int drinkCode = 2;

        switch (drinkCode) {
            case 1:
                System.out.println("콜라");
                break;
            case 2:
                System.out.println("사이다");
                break;
            case 3:
                System.out.println("물");
                break;
            case 4:
                System.out.println("커피");
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }

}


