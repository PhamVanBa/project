package vti.com.vn.railway33;

import java.lang.ProcessHandle.Info;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub

		System.out.println("Get connection ...");
		
		// lay dt ket noi database
		Connection conn = Program.getMyConnection();
		getAccount(conn);
		
		conn.close();
	}

	
	public static Connection getMyConnection() throws SQLException, ClassNotFoundException{
		return MySQLConnUtils.getMySQLConnection();
	}
	
	public static void getAccount(Connection connection) throws SQLException {
		
		String sql = "SELECT stk, hoTen, gioiTinh, cmt, sdt FROM account";
		
		PreparedStatement pstm = connection.prepareStatement(sql);
		
		ResultSet rs = pstm.executeQuery();
		// duyet ket noi database
		while (rs.next()) {
			int stk = rs.getInt("stk");
			String hoTen = rs.getString("hoTen");
			String gioiTinh = rs.getString("gioiTinh");
			String cmt = rs.getString("cmt");
			String sdt = rs.getString("sdt");
			
			System.out.println("----------------***--------------");
			System.out.println("So Tai Khoan: " + stk);
			System.out.println("Ho Ten: " + hoTen);
			System.out.println("Gioi Tinh: " + gioiTinh);
			System.out.println("Chung Minh Thu: "+ cmt);
			System.out.println("So Dien Thoai: " + sdt);
		}
	}
}
