package ch03;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeQueueEx10 {

	public static void main(String[] args) {

		// ArrayDeque 객체 생성
		Deque<String> deque = new ArrayDeque<>();

		// 큐 구조: 데이터 추가 (offer)
		deque.offer("Alice");
		deque.offer("Bob");
		deque.offer("Charlie");

		// 큐 구조: 가장 앞에 있는 요소 확인 (peek)
		System.out.println("가장 앞에 있는 사람: " + deque.peek()); // Alice

		// 큐 구조: 가장 앞에 있는 요소 꺼내기 (poll)
		System.out.println("큐에서 꺼낸 사람: " + deque.poll()); // Alice
		System.out.println("큐에서 꺼낸 사람: " + deque.poll()); // Bob

		// 큐 구조: 남은 요소 확인 (peek)
		System.out.println("가장 앞에 있는 사람: " + deque.peek()); // Charlie

		// 큐 구조: 남은 요소 모두 꺼내기 (poll)
		System.out.println("큐에서 꺼낸 사람: " + deque.poll()); // Charlie
		System.out.println("큐가 비었나요? " + deque.isEmpty()); // true
	}
}