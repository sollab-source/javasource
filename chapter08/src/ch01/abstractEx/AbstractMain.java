package ch01.abstractEx;

public class AbstractMain {
	
	public static void main(String[] args) {
		Bird duck = new Duck();
		duck.makeSound();
		Bird pigeon = new Pigeon();
		pigeon.makeSound();
		Bird Owl = new Owl();
		Owl.makeSound();
	}
}