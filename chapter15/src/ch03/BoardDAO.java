package ch03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// 드라이버 등록
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		// 데이터베이스 연결 메소드
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##java";
			String password = "12345";

			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public void close(Connection con, PreparedStatement pstmt) {
		try {
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<BoardDTO> getRows() {

		List<BoardDTO> list = new ArrayList<BoardDTO>();

		try {

			con = getConnection();

			String sql = "SELECT bno, title, content, writer, regdate FROM boards ";
			sql += "ORDER BY bno DESC";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setBno(rs.getInt("bno"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setRegDate(rs.getDate("regdate"));
				list.add(board);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}

	public BoardDTO getRow(int bno) {

		BoardDTO board = null;

		try {

			con = getConnection();

			String sql = "SELECT bno, title, content, writer, regdate FROM boards ";
			sql += "WHERE bno = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				board = new BoardDTO();
				board.setBno(rs.getInt("bno"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setRegDate(rs.getDate("regdate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return board;
	}

	public int updateRow(BoardDTO dto) {

		int result = 0;

		try {

			Connection con = getConnection();

			String sql = "UPDATE boards SET title = ?, content = ? WHERE bno = ?";

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getBno());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return result;
	}

	public int deleteRow(int bno) {

		int result = 0;

		try {

			Connection con = getConnection();

			String sql = "DELETE FROM boards WHERE bno = ?";

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return result;
	}

	public int deleteAll() {

		int result = 0;

		try {

			Connection con = getConnection();

			String sql = "DELETE FROM boards";

			PreparedStatement pstmt = con.prepareStatement(sql);
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return result;
	}

	public int create(BoardDTO dto) {

		int result = 0;

		try {

			Connection con = getConnection();

			String sql = "INSERT INTO boards(bno, title, content, writer) ";
			sql += "VALUES(board_seq.nextval, ?, ?, ?)";

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getWriter());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return result;
	}
}
