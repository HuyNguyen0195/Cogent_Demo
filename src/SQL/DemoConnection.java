package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoConnection {
	public static void main(String[] args) {
		Connection con=null;
		//step 1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//step 2
		String url="jdbc:mysql://localhost:3306/jdbc_db";
		String username="root";
		String password="Khang!23";
		try {
			con=DriverManager.getConnection(url,username,password);
			if(con != null) {
				System.out.println("congratulation");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
				System.out.println("closed");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
