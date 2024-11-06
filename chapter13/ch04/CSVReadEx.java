package ch04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSVReadEx {
	public static void main(String[] args) {
        // CSV 파일 경로 설정
        String csvFile = "data.csv";

        // BufferedReader를 사용하여 CSV 파일에서 데이터 읽기
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), "EUC-KR"))) {
            String line;
            System.out.println("CSV 파일 내용:");

            // 파일에서 데이터를 한 줄씩 읽기
            while ((line = br.readLine()) != null) {
                // CSV 데이터를 쉼표로 분리하여 출력
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.print(value + "\t");
                }
                System.out.println(); // 줄바꿈
            }
        } catch (IOException e) {
            System.err.println("CSV 파일을 읽는 도중 오류 발생: " + e.getMessage());
        }
    }
}

