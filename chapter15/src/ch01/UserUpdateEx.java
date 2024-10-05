package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdateEx {

	public static void main(String[] args) {
		
		Connection con = null;				 

        try {
            // 1. JDBC 드라이버 등록
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. Connection 얻기            
            String url = "jdbc:oracle:thin:@localhost:1521:xe";    // 연결문자열
            String user = "c##java"; 	                           // 사용자
            String password = "12345";                             // 비밀번호

            con = DriverManager.getConnection(url, user, password);
            
            
            // 3. 매개 변수화된 SQL 문 작성
            String sql = "UPDATE usertbl SET email = ? WHERE userid = ?";            
            
            // 4. PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "winter77@naver.com");
            pstmt.setString(2, "winter");
            

            // 5. SQL 구문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("수정된 user 수 : "+rows);	
            
            pstmt.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	if(con != null) {
        		try {
        			con.close();                                   // 연결 종료
        		} catch (SQLException e) {				
        			e.printStackTrace();
        		}        		
        	}
		}
	}
}
