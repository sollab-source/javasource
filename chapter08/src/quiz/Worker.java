package quiz;

public class Worker extends Person {
	@Override
	public void doActivity() {
		System.out.println("직장인은 일을 합니다.");
	}
}