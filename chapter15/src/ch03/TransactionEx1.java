package ch03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionEx1 {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##java";
			String password = "12345";

			con = DriverManager.getConnection(url, user, password);
			
			//트랜잭션 시작 -------------------------------
			
			//자동 커밋 중지
			con.setAutoCommit(false);
			
			// 출금작업
			String sql = "UPDATE accounts SET balance = balance - ? WHERE account_no = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 10000);
			pstmt.setString(2, "111-111-1111");
			int row = pstmt.executeUpdate();
			if(row == 0) throw new Exception("출금 불가");
			pstmt.close();
			
			// 입금작업
			sql = "UPDATE accounts SET balance = balance + ? WHERE account_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 10000);
			pstmt.setString(2, "222-222-2222");
			row = pstmt.executeUpdate();
			if(row == 0) throw new Exception("입금 불가");
			pstmt.close();
			
			//수동 커밋
			con.commit();
			System.out.println("계좌 이체 성공");
			
			//트랜잭션 종료 -------------------------------
		} catch (Exception e) {
			
			try {
				con.rollback();
			} catch (Exception e2) {
				System.out.println("계좌 이체 실패");
				e2.printStackTrace();
			}			
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
