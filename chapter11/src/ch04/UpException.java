package ch04;

@SuppressWarnings("serial")
public class UpException extends Exception {
	public UpException(int point) {
		super("입력한 포인트가 50보다 큽니다. : "+point);
	}
}
