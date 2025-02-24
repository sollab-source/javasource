package quiz;

import java.util.stream.Stream;

public class QuizEx03 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("abc","def","apple","melon","text");
		
		//대문자로 변경 후 출력하기
		stream.map(s -> s.toUpperCase()).forEach(System.out::println);		
	}	
}
