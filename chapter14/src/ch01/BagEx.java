package ch01;

import ch01.Bag.Pouch;

public class BagEx {

	public static void main(String[] args) {
		Bag bag = new Bag("test",100000L);
		
		Bag.Pouch p = bag.new Pouch();
		p.printMember();
		
		
		System.out.println(Pouch.k);

	}

}
