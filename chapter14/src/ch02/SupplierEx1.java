package ch02;

import java.util.function.Supplier;

public class SupplierEx1 {
	public static void main(String[] args) {
		// 인자를 받아 메소드 안에서 사용하는 형태
		Supplier<Integer> supplier = () -> (int)(Math.random() * 100)+1;
		System.out.println("1~100 임의의 수 추출 "+supplier.get());
		
		Supplier<String> supplier2 = () -> "매개 값을 받아 처리";
		System.out.println("문자열 "+supplier2.get());
	}
}
