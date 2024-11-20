package ch02;

@FunctionalInterface
interface MyFunctionInterface3 {
	void showMsg(String message);
}

public class LambdaEx03 {
	public static void main(String[] args) {
		// 람다식 생성
		MyFunctionInterface3 f = s -> System.out.println(s);
		f.showMsg("람다식 생성");

		// 매개변수 람다식
		MyFunctionInterface3 f3 = showMyMsg();
		f3.showMsg("Hello");
	}

	public static MyFunctionInterface3 showMyMsg() {
		return s -> System.out.println(s + " World");
	}
}