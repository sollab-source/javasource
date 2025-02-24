package quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionquizEx08 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>(
				Arrays.asList("Alice", "Bob", "Charlie"));
		String searchName = "Bob";

		// 정답작성
		if(names.contains(searchName)) {
			System.out.println(searchName + "이(가) 목록에 존재합니다.");
		}else {
			System.out.println(searchName + "이(가) 목록에 존재하지 않습니다.");			
		}
	}
}