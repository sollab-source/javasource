
 package ch01;

 import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;

 public class FileIOExample {
     public static void main(String[] args) {
         String data = "Hello, this is a test of FileInputStream and FileOutputStream.";
         String filePath = "output.txt";

         // FileOutputStream을 사용하여 파일에 데이터 쓰기
         try (FileOutputStream fos = new FileOutputStream(filePath)) {
             fos.write(data.getBytes());
             System.out.println("파일에 데이터가 성공적으로 저장되었습니다.");
         } catch (IOException e) {
             e.printStackTrace();
         }

         // FileInputStream을 사용하여 파일에서 데이터 읽기
         try (FileInputStream fis = new FileInputStream(filePath)) {
             int content;
             System.out.println("파일에서 읽은 데이터:");
             while ((content = fis.read()) != -1) {
                 System.out.print((char) content);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
      }
  }

