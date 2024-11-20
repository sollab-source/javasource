package quiz;

public class Computer implements Printer {
	@Override
	public void print() {
		System.out.println("컴퓨터로 인쇄합니다.");
	}
}