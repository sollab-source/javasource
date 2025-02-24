package ch01.genericvalueEx03;

public class GenericValueMain {

	public static void main(String[] args) {

		GenericValue<String> v1 = new GenericValue<String>();
		v1.setVlaue("100");
		System.out.println(v1.getVlaue());

		GenericValue<Integer> v2 = new GenericValue<Integer>();
		v2.setVlaue(100);
		System.out.println(v2.getVlaue());

		GenericValue<Double> v3 = new GenericValue<Double>();
		v3.setVlaue(3.141592);
		System.out.println(v3.getVlaue());

		GenericValue<Character> v4 = new GenericValue<Character>();
		v4.setVlaue('A');
		System.out.println(v4.getVlaue());

	}
}