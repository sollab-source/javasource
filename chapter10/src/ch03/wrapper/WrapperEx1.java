package ch03.wrapper;

public class WrapperEx1 {

	public static void main(String[] args) {
		//String -> int으로 벼환
		int i = new Integer("100").intValue();
		int i2 = Integer.parseInt("100", 10);
		Integer i3 = Integer.valueOf("100");
		
		int i4 = Integer.parseInt("100", 2);
		int i5 = Integer.parseInt("100", 8);
		int i6 = Integer.parseInt("100", 16);
		
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		
	}

}
