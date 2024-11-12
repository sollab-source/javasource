package ch02;

import java.io.FileInputStream;
public class TryWithResourceEx {
	public static void main(String[] args) {
		//AutoCloseable을 구현한 타입만 가능(close()메서드 가지고 있음)
		try(FileInputStream fis = new FileInputStream("file 경로");){
			//수행문
		}catch (Exception e) {
			//예외 발생시 수행문
		}
		//try-catch끝나면 연결된 리소스가 자동 close()처리됨
	}
}
