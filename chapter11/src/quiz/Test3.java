package quiz;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		FileInputStream is = null;
		BufferedInputStream bis = null;
		try {
			is = new FileInputStream("file.txt");
			bis = new BufferedInputStream(is);
			int data = -1;
			while ((data = bis.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close resources
			if (is != null)
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (bis != null)
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
