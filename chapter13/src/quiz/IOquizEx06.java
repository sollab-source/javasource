package quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOquizEx06 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(
				new FileReader("example.txt"))) {
			String line;
			while ((line = br.readLine()) != null) { // 여기를 채우세요.
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}