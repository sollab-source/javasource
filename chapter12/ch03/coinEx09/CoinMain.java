package chapter13.ch03.coinEx11;

import java.util.ArrayDeque;
import java.util.Deque;

public class CoinMain {

	public static void main(String[] args) {
		
		// ArrayDeque 객체 생성 (스택처럼 사용)
        Deque<Coin> coinStack = new ArrayDeque<>();
        
        //동전추가
        coinStack.push(new Coin(500));
        coinStack.push(new Coin(100));
        coinStack.push(new Coin(50));
        coinStack.push(new Coin(10));
        
        //스택이 비어 있지 않은지 확인하고 출력
        System.out.println("스택이 비어 있지 않은가? "+ !coinStack.isEmpty());
        
        //스택이 비어 있지 않은면 동전 하나씩 꺼내기(pop)
        while(!coinStack.isEmpty()) {
        	Coin coin=coinStack.pop();
        	System.out.println("꺼내온 동전: "+coin.getValue());
        	
        }
	}
}
