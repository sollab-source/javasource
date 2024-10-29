package ch10.wrapper;

public class AutoBoxingEx1 {

	public static void main(String[] args) {
		//Autoboxing
		Integer i = 10;
		//Integer i = new Integer(10); 실제 수행되는 코드
		//Unboxing
		int i2 = new Integer(20); 
		//int i2 = new Integer(20).intValue(); 
		
		Object obj = 30;
		//Object obj = new Integer(30);
		
		//기본형과 wrapper참조형간의 연산 가능
		int result = i + 10;
		
		//wrapper 참조형 간의 연산 가능
		int result2 = i + new Integer(100);
		long l1 = new Long(10) + new Integer(20);
		
		long i3 = i2;
//		Long l2 = i;//Integer  -> boxing은 형변환 아님. 다른 타입간에는 boxing 불가
//		Long l3 = 10;//다른 타입간에는 boxing 불가
		
	}
}






