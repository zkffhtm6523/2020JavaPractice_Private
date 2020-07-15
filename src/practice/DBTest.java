package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Result;

public class DBTest {
//	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static String user = "root";
//	private static String password = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
	
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
	
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.dirver.OracleDriver");
//		return con;
//	}
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception {
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception{
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static final String user = "root";
//	private static final String password = "root";
//	
//	public static Connection getCon() throws Exception {
//		Connection con = DriverManager.getConnection(url, user, password);
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		return con;
//	}
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "root";
	private static final String password = "root";
	public static String sql = "select * from student";
	
	public static Connection getCon() throws Exception{
		Connection con = DriverManager.getConnection(url, user, password);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return con;
	}
	
	public static void getDB() {
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String user_name = rs.getString("user_name");
				String user_password = rs.getString("user_password");
				String user_index = rs.getString("user_index");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println(sql);
	}
	
}
