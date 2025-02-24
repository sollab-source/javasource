package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionquizEx09 {

	public static void main(String[] args) {

		// 사용자로부터 입력된 숫자들
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		numbers.add(5);

		// 정답작성
		HashSet<Integer> set = new HashSet<Integer>();
		for(int n : numbers) {
			set.add(n);
		}
		for(int s : set) {
			System.out.println(s);
		}
	}
}