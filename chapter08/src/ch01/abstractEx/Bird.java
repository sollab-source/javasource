package ch01.abstractEx;

public abstract class Bird {
	// 추상메소드
	public abstract void makeSound();
}

class Duck extends Bird {
	public void swim() {
		System.out.println("오리가 수영을 합니다.");
	}

	// 재정의된 메소드
	@Override
	public void makeSound() {
		System.out.println("오리가 꽉꽉하고 웁니다.");
	}
}

class Pigeon extends Bird {
	public void dilver() {
		System.out.println("비둘기가 편지를 전달합니다.");
	}

	// 재정의된 메소드
	@Override
	public void makeSound() {
		System.out.println("비둘기가 구구하고 웁니다.");
	}
}

class Owl extends Bird {
	public void hunt() {
		System.out.println("부엉이가 사냥을 합니다.");
	}

	// 재정의된 메소드
	@Override
	public void makeSound() {
		System.out.println("부엉이가 부엉부엉하고 웁니다.");
	}
}