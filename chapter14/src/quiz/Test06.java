package quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test06 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("홍길동", "디자이너"), 
				new Member("김지호", "개발자"), new Member("최민수", "서버"),
				new Member("이소영", "개발자"), new Member("김민지", "데이터베이스"));

		List<String> developers = list.stream().filter(s -> s.getJob().equals("개발자")).map(Member::getName)
				.collect(Collectors.toList());
		System.out.println(developers);
	}
}