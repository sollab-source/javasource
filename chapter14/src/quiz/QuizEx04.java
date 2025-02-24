package quiz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class QuizEx04 {
	public static void main(String[] args) {
		String[] fruitArr = {"apple","watermelon","banana", "kiwi","grape"};
				
		//스트림을 이용해 가장 긴 문자열의 길이를 출력하시오
		Stream<String> stream = Arrays.stream(fruitArr);
		
		stream.map(s -> s.length())
		      .sorted(Comparator.reverseOrder())
		      .limit(1)
		      .forEach(System.out::println);		
	}	
}
