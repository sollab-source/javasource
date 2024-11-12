
 package ch02;

 import java.io.*;

 public class BufferedReaderWriterExample {
     public static void main(String[] args) {
         String filePath = "buffered_output.txt";
         String[] data = {"Hello, world!", "This is a test.", "Java I/O is interesting!"};

         // BufferedWriter를 사용하여 파일에 줄 단위로 데이터 쓰기
         try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
             for (String line : data) {
                 bw.write(line);
                 bw.newLine();  // 줄바꿈
             }
             System.out.println("파일에 데이터가 성공적으로 저장되었습니다.");
         } catch (IOException e) {
             e.printStackTrace();
         }

         // BufferedReader를 사용하여 파일에서 데이터 읽기
         try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
             String line;
             System.out.println("파일에서 읽은 데이터:");
             while ((line = br.readLine()) != null) {
                 System.out.println(line);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
  }
 
 
