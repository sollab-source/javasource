package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TodoDAO {

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

	public List<TodoDTO> getRows() {

		List<TodoDTO> todos = new ArrayList<TodoDTO>();

		try {

			con = getConnection();

			String sql = "SELECT no, title, created_at, completed, important FROM todo ";
			sql += "ORDER BY no DESC";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				TodoDTO todo = new TodoDTO();
				todo.setNo(rs.getInt("no"));
				todo.setTitle(rs.getString("title"));
				todo.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
				todo.setCompleted(rs.getBoolean("important"));
				todos.add(todo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return todos;
	}

	public TodoDTO getRow(int no) {

		TodoDTO todo = null;

		try {

			con = getConnection();

			String sql = "SELECT no, title, created_at, completed, important FROM todo ";
			sql += "WHERE bno = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				todo = new TodoDTO();
				todo.setNo(rs.getInt("no"));
				todo.setTitle(rs.getString("title"));
				todo.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
				todo.setCompleted(rs.getBoolean("important"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return todo;
	}

	public int updateCompleted(TodoDTO dto) {

		int result = 0;

		try {

			Connection con = getConnection();

			String sql = "UPDATE todo SET completed = ? WHERE no = ?";

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setBoolean(1, dto.isCompleted());			
			pstmt.setInt(2, dto.getNo());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return result;
	}

	public int deleteRow(int no) {

		int result = 0;

		try {

			Connection con = getConnection();

			String sql = "DELETE FROM todo WHERE no = ?";

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);

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

	public int create(TodoDTO dto) {

		int result = 0;

		try {

			Connection con = getConnection();

			String sql = "INSERT INTO todo(no, title, created_at, important) ";
			sql += "VALUES(todo_seq.nextval, ?, ?, ?)";

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setTimestamp(2,LocalDateTime.now());
			pstmt.setBoolean(3, dto.isImportant());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return result;
	}
}
