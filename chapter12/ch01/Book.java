package chapter13.ch01;

public class Book<T> {
	
	private T item;
	
	public void set(T item) {
		this.item=item;
	}
	
	public T get() {
		return item;
	}
	
	public <T> void printItem(T item) {
		System.out.println(item);
	}
	
	public <T extends Number> void printNumber(T number) {
		System.out.println(number);
	}

}
