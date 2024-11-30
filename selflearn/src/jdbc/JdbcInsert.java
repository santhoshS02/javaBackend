package jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {

	public static void main(String[] args) throws Exception {
		
		
		// readrecords();    // This is the read Sql records from Ecplice.
		// insertrecords();   // This is the update jdbc to mysql
		// updateterecords();    // This is the upadate the recored values .
		//  insertvariable();   // This is insert the variable through the String varable 
		// insertusingpst();   // This will update the prepared statement values .
		//delete(); 			// This is delete the values;
		   update(); 
	}
	
	//********************************************************//
	public static void readrecords() throws Exception
	{
		String URL = "jdbc:mysql://localhost:3306/mysqldatabase";
		String username = "root";
		String Password = "Santhosh@123";
		String query ="select * from employe";
		
		Connection con = DriverManager.getConnection(URL, username, Password);
		Statement st = con.createStatement();
		
		ResultSet rt =st.executeQuery(query);
		
		while(rt.next())
		{
		System.out.println("Id is : " + rt.getInt(1));
		System.out.println("Em_name is :" + rt.getString(2));
		System.out.println("Em_salary is :"  + rt.getInt(3));
		System.out.println("CGPA is : " + rt.getBigDecimal(4) );
		}
		
		con.close();
		
	}
	
	//************************************************************//
	
	// hard code values
		public static void insertrecords() throws Exception
		{
			String URL = "jdbc:mysql://localhost:3306/mysqldatabase";
			String username = "root";
			String password = "Santhosh@123";
			String query ="insert into employe values (5,'Rahul',345000,9.45)";
				
			Connection con = DriverManager.getConnection(URL,username,password);
			
			Statement st = con.createStatement();
			
			int row =  st.executeUpdate(query);
			
			System.out.println(" Now of rwo affected : " + row);
			
			con.close();	
		}
	
		//********************************************************************//
		// prepared statement 
		public static void updateterecords() throws Exception 
		{
			
			String URL = "jdbc:mysql://localhost:3306/mysqldatabase";
			String username = "root";
			String password = "Santhosh@123";
			String query ="update employe set e_mane =? where emp_id = ? ";
				
			String e_mane="Santhosh";
			int emp_id = 2;
			Connection con = DriverManager.getConnection(URL,username,password);
			
			PreparedStatement st = con.prepareStatement(query); 
			
			
			st.setString(1, e_mane); // Bind e_mane to the first placeholder
		    st.setInt(2, emp_id);			
			int row =  st.executeUpdate();
			
			System.out.println(" Now of rwo affected : " + row);
			
			con.close();
		}
		
		//**********************************************************************//
		
		// variable using update value 
		public static void insertvariable() throws Exception
		{
			

			String URL = "jdbc:mysql:// localhost:3306/mysqldatabase";
			String username = "root";
			String password = "Santhosh@123";
			
			
			int emp_id = 6;
			String e_mane = "priya";
			int salary =340030;
			double mark = 9.6;
			
			String query = "INSERT INTO employe VALUES (" + emp_id + ", '" + e_mane + "', " + salary + ", " + mark + ");";
			System.out.println(query);

			
			Connection con = DriverManager.getConnection(URL,username,password);
			
			Statement st = con.createStatement();
			
			int row =  st.executeUpdate(query);
			
			System.out.println(" Now of row affected : " + row);
			
			con.close();
		}
			
		//**********************************************************************//

		// prepared statement
		
		public static void insertusingpst() throws Exception
		{

			String URL = "jdbc:mysql://localhost:3306/mysqldatabase";
			String username = "root";
			String password = "Santhosh@123";
			
			
			int emp_id = 7;
			String e_mane = "Ramya";  
			int salary =370030;
			double mark = 8.6;
			
			String query = "INSERT INTO employe VALUES(?,?,?,?); ";

			
			Connection con = DriverManager.getConnection(URL,username,password);
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, emp_id);
			pst.setString(2, e_mane);
			pst.setInt(3, salary);
			pst.setDouble(4, mark);
			
			int rows = pst.executeUpdate();
			
			
			System.out.println(" Now of row affected : " + rows);

			con.close();
		}
	
		//*******************************************************************//
		// delete 
		
		public static void delete () throws Exception
		{
			

			String URL = "jdbc:mysql:// localhost:3306/mysqldatabase";
			String username = "root";
			String password = "Santhosh@123";
			
			
			int id = 4;
			
			
			String query = "delete from employe where emp_id = " + id ;

			
			Connection con = DriverManager.getConnection(URL,username,password);
			
			Statement st = con.createStatement();
			
			int row =  st.executeUpdate(query);
			
			System.out.println(" Now of row affected : " + row);
			
			con.close();
		}
		
		//********************************************************************//
		
			// update 
		public static void update  () throws Exception
		{
			

			String URL = "jdbc:mysql:// localhost:3306/mysqldatabase";
			String username = "root";
			String password = "Santhosh@123";
			
			
			
			
			String query = "update  employe set marks	 = 9.7 where emp_id=2";

			
			Connection con = DriverManager.getConnection(URL,username,password);
			
			Statement st = con.createStatement();
			
			int row =  st.executeUpdate(query);
			
			System.out.println(" Now of row affected : " + row);
			
			con.close();
		}
		

}
