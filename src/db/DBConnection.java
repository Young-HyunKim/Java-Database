package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //DB_Driver
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection openConnection(){
		Connection con = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:XE"; //DB_Url:Port:DB_Name
			String id = "id";	
			String passwd = "pw";
			con = DriverManager.getConnection(url, id, passwd);
			System.out.println("Database Connection Pass");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void closeConnection(Connection con){
		if(con != null){
			try {
				con.close();
				System.out.println("Database Close");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}