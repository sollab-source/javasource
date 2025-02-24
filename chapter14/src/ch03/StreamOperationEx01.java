package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationEx01 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sophia","Emma",
				"Olivia","Isabella","Mia");

		Stream<String> stream = list.stream();
		// �߰����� sorted() ���� �� �������� forEach() ����
		stream.sorted().forEach(System.out::println);

		// ���� �߻� - 20�� �� ���� �� ��Ʈ���� �̹� ����
		// stream.filter(s -> s.contains("m"))
		//					   .forEach(System.out::println);

		// ��Ʈ�� ��ȯ
		System.out.println("m or M �� �� �̸� ���");
		list.stream().filter(s -> s.toUpperCase()
								   .contains("M"))
								   .forEach(System.out::println);

		System.out.println();
		System.out.println("�̸� ���̰� 5�� �̻��� �̸� ���");
		list.stream().filter(s -> s.length() >= 5)
			.forEach(System.out::println);

		int arr[] = { 39, 58, 88, 56, 77, 99, 23 };

		// �������� ���� �� ���
		System.out.println("�������� ���� �� ���");
		Arrays.stream(arr).sorted()
			  .forEach((i) -> System.out.print(i + "\t"));

		System.out.println("\n");

		// ��Ʈ�� ��ȯ
		System.out.println("¦�� ���");
		Arrays.stream(arr).filter(i -> i % 2 == 0)
			  .forEach((i) -> System.out.print(i + "\t"));

		System.out.println("\n");

		System.out.println("2�� ����� �ƴϰ�,"
				+ " 3�� ����� �ƴ� ���� ���");
		Arrays.stream(arr)
			  .filter(i -> i % 2 != 0 && i % 3 != 0)
			  .forEach((i) -> System.out.print(i + "\t"));
	}
}