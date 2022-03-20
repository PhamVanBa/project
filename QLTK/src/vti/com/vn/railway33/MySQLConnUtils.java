package vti.com.vn.railway33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {
	
	// ket noi MySQL
	
	public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
		
		String hostName = "localhost";
		
		String dbName = "qltk";
		String userName = "root";
		String password = "15041993Ba";
		
		return getMySQLConnection(hostName, dbName, userName, password);
	}
	
	public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password)
				throws SQLException, ClassNotFoundException {
		
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
		
	}

}
