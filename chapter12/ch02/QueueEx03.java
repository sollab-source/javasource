package chapter13.ch02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx03 {

	public static void main(String[] args) {

		// LinkedList를 Queue로 사용
		Queue<String> queue = new LinkedList<>();

		// 고객 추가
		queue.add("Customer1");
		queue.add("Customer2");
		queue.add("Customer3");

		// 대기 중인 고객 출력
		System.out.println("Customers in the queue");
		for (String customer : queue) {
			System.out.println(customer);
		}
		
		//고객 서비스
		String servedCustomer1= queue.poll();//대기열의 첫 번째 고객을 서비스
		System.out.println("\nServed: "+servedCustomer1);
		
		//다음 고객 위치 파악
		String servedCustomer2= queue.peek();
		System.out.println("\nServed: "+servedCustomer2);
		
		// 수정된 대기열 출력
        System.out.println("\nRemaining customers in the queue");
        for(String customer:queue) {
        	System.out.println(customer);
        }
	}
}
