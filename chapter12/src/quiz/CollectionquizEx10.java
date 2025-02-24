package quiz;

import java.util.HashMap;

public class CollectionquizEx10 {

	public static void main(String[] args) {

		HashMap<String, Integer> students = new HashMap<>();
		students.put("Alice", 85);
		students.put("Bob", 45);
		students.put("Charlie", 78);
		students.put("Dave", 59);

		// 정답작성
		students.forEach((s,i) ->{
			if(i >= 60) {
				System.out.println(s + ": " + i);
			}
		});
	}
}