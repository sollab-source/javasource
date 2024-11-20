package ch01.genericvalueEx03;

public class GenericValue<T> {

	// 멤버변수(필드)
	T vlaue;

	// 생성자

	// 메서드
	public T getVlaue() {
		return vlaue;
	}

	public void setVlaue(T vlaue) {
		this.vlaue = vlaue;
	}
}