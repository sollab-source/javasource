package ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx01 {
    public static void main(String[] args) {

        Connection con = null;

        try {
            // 1. JDBC 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. Connection 얻기            
            String url = "jdbc:oracle:thin:@localhost:1521:xe";    // 연결문자열
            String user = "c##java"; 	                           // 사용자
            String password = "12345";                             // 비밀번호

            con = DriverManager.getConnection(url, user, password);

            System.out.println("연결되었습니다.");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	if(con != null) {
        		try {
        			con.close();                                  // 연결 종료
        		} catch (SQLException e) {				
        			e.printStackTrace();
        		}        		
        	}
		}
    }
}
