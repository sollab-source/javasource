package ch03;

import java.util.Stack;

public class StackEx08 {
	public static void main(String[] args) {

		// Stack 객체 생성
		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		// Stack의 맨 위 데이터 확인(peek)
		System.out.println("Stack의 맨 위 요소: " + stack.peek());

		// Stack에서 데이터 출력(pop)
		System.out.println("꺼낸 데이터: " + stack.pop());

		System.out.println("Stack의 현재 요소: " + stack.peek());
		System.out.println("꺼낸 데이터: " + stack.pop());

		System.out.println("Stack의 현재 요소: " + stack.peek());

		// stack이 비어 있는지 확인
		System.out.println("Stack이 비어 있나요? " + stack.isEmpty());// false

		// stack의 마지막 데이터 출력
		System.out.println("꺼낸 데이터: " + stack.pop());
		System.out.println("Stack이 비어 있나요? " + stack.isEmpty());// false
	}
}