package ch10.other;

public class SystemEx1 {

	public static void main(String[] args) {
		
		System.out.println("현재시간 : " + System.currentTimeMillis() + "ms");

		long start = System.nanoTime();
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		long end = System.nanoTime();
		
		System.out.println("1 ~ 1000000까지의 합 : " + sum);
		System.out.println("걸린 시간 : " + (end - start) + "ns");

	}

}
