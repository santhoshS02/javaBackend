package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnect {

	public static void main(String[] args) throws Exception {

		String URL = "jdbc:mysql://localhost:3306/mysqldatabase";
		String username = "root";
		String Password = "Santhosh@123";
		String query ="select * from employe";
		
		Connection con = DriverManager.getConnection(URL, username, Password);
		
		Statement st = con.createStatement();
		ResultSet re = st.executeQuery(query); 
		
		while(re.next())
		{
		System.out.println("Id is : "+ re.getInt(1) +" ");
		System.out.println("Nmae is : " + re.getNString(2) + " ");
		System.out.println("Salary is : "+ re.getInt(3) + " ");
		System.err.println("mark is : " + re.getBigDecimal(4)+" ");
		}
		
		con.close();
		
		
	}

}
