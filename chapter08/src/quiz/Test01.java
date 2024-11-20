package quiz;

public class Test01 {
	
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();

		dog.makeSound(); // 멍멍
		cat.makeSound(); // 야옹
	}
}