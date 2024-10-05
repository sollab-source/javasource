package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdateEx2 {

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
           
            // 트랜잭션 시작
            // 자동 커밋 끄기
        	con.setAutoCommit(false);
        	// 소작업 처리
        	
        	// 소작업 처리
        	
        	// 커밋
        	con.commit();        	
        	
        	// 트랜잭션 종료
        } catch (Exception e) {
            try {
            	con.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}            
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
