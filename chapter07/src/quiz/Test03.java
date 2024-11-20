package quiz;

public class Test03 {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();

		// 각 객체의 메소드 호출
		dog.makeSound(); // 멍멍
		cat.makeSound(); // 야옹
	}
}