package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

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

	public List<ProductDTO> getProducts() {

		List<ProductDTO> products = new ArrayList<ProductDTO>();

		try {

			con = getConnection();

			String sql = "SELECT pid, name, price, quantity FROM product ";
			sql += "ORDER BY pid DESC";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				ProductDTO product = new ProductDTO();
				product.setPid(rs.getInt("pid"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setQuantity(rs.getInt("quantity"));
				
				products.add(product);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return products;
	}

	public ProductDTO getProduct(int pid) {

		ProductDTO product = null;

		try {

			con = getConnection();

			String sql = "SELECT pid, name, price, quantity FROM product ";
			sql += "WHERE pid = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				product = new ProductDTO();
				product.setPid(rs.getInt("pid"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setQuantity(rs.getInt("quantity"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return product;
	}

	public int update(ProductDTO dto) {

		int result = 0;

		try {

			Connection con = getConnection();

			String sql = "UPDATE product SET quantity = quantity - ? WHERE pid = ?";

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getQuantity());			
			pstmt.setInt(2, dto.getPid());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return result;
	}

	public int delete(int pid) {

		int result = 0;

		try {

			Connection con = getConnection();

			String sql = "DELETE FROM product WHERE pid = ?";

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pid);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return result;
	}
	
	public int create(ProductDTO dto) {

		int result = 0;

		try {

			Connection con = getConnection();

			String sql = "INSERT INTO product(pid, name, price, quantity) ";
			sql += "VALUES(product_seq.nextval, ?, ?, ?)";

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());			
			pstmt.setInt(2, dto.getPrice());
			pstmt.setInt(3, dto.getQuantity());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return result;
	}
}
