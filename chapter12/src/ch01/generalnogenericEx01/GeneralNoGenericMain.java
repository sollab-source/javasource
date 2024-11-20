package ch01.generalnogenericEx01;

public class GeneralNoGenericMain {

	public static void main(String[] args) {

		GeneralNoGeneric general = new GeneralNoGeneric();

		// 정수형 배열
		Integer[] iArr = { 10, 20, 30, 40, 50 };
		general.printIntArr(iArr);

		Double[] dArr = { 10.1, 20.2, 30.3, 40.4, 50.5 };
		general.printDoubleArr(dArr);

		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		general.printCharArr(cArr);

	}
}