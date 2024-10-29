package ch01;

public class OperatorEx02 {

	   public static void main(String[] args) {
		   
	        int totalBooks = 95;   // 총 책의 수
	        int students = 6;      // 학생 수
	        
	        // 학생당 나눠줄 책의 수를 구하여 booksPerStudent에 저장하고 출력하세요.
	        int booksPerStudent = totalBooks / students;
	        System.out.println("학생당 나눠줄 책의 수: " + booksPerStudent);
	        
	        // 남은 책의 수를 구하여 remainingBooks에 저장하고 출력하세요.
	        int remainingBooks = totalBooks % students;
	        System.out.println("남은 책의 수: " + remainingBooks);
	        
	    }
	   
}
