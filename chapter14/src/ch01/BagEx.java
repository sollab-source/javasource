package ch01;

import ch01.Bag.Pouch;

public class BagEx {

	public static void main(String[] args) {
		Bag bag = new Bag("chanel",100000L);
		
		//inner 클래스의 경우에는 직접 객체 생성 불가
		//Pouch pouch = new Pouch();
		
		//Bag.Pouch p = bag.new Pouch();
		//p.printMember();
		
		
		System.out.println(Pouch.k);

	}

}
