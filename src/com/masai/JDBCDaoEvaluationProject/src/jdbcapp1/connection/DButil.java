package jdbcapp1.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class DButil {
		
		public static Connection getConnection() {
			Connection conn = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url = "jdbc:mysql://localhost:3306/db1";
			try {
				conn = DriverManager.getConnection(url, "root", "sony@11");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
     
}
