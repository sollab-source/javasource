package ch01;

public class ArrayEx01 {
	
    public static void main(String[] args) {
    	
        // 문자열 배열 선언 및 초기화
        String[] fruits = {"Apple", "Banana", "Cherry", "Fig"};

        
        // 배열 요소 출력
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }
    }
}
