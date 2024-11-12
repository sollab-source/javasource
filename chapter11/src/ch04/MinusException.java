package ch04;

@SuppressWarnings("serial")
public class MinusException extends Exception {
	
	public MinusException(int point) {
		super("입력한 포인트는 음수입니다. : "+ point);
	}
}
