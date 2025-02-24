package ch02.polymorphismEx01;

public class ExcavatorMain {
	public static void main(String[] args) {

		Excavator excavator = new Excavator();

		excavator.operate(new Bucket());
		excavator.operate(new Drill());
		excavator.operate(new Grapple());
	}
}