package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class JdbcCallableStatement {

	public static void main(String[] args) throws Exception {

		 // storeprocedure();   // this is the stored procedure value 
		  //SPDwithparameter();  //this will show the IN parameter value.
		  //SPDwithInparameter();   // this will show the IN value get it and Show the OUT values.
			 
	     	//Commit();          // This will commit the values .
		
		Batchprocessing();      // This is used for the batch of combining process.
	}
	
	//***********************************************************//
	// stored procedure 
	public static void storeprocedure() throws Exception
	{
		String URL = "jdbc:mysql:// localhost:3306/mysqldatabase";
		String username = "root";
		String password = "Santhosh@123";	
		
		Connection con = DriverManager.getConnection(URL, username, password);
		
		CallableStatement CST = con.prepareCall("{call getemp()}");
	    
		ResultSet rt = CST.executeQuery();
		
		while(rt.next())
		{
		System.out.print ("Id is : " + rt.getInt(1) +" ");
		System.out.print ("Em_name is :" + rt.getString(2) +" ");
		System.out.print ("Em_salary is :"  + rt.getInt(3)+" ");
		System.out.println("CGPA is : " + rt.getBigDecimal(4) );
		}
		
		con.close();
		
	}
	
	//************************************************************************//
	//Stored procedure with IN parameter 
	// THis is used buy the prepared statement method
	
	
	public static void SPDwithparameter() throws Exception
	{
		String URL = "jdbc:mysql:// localhost:3306/mysqldatabase";
		String username = "root";
		String password = "Santhosh@123";	
		
		int id =3;
		Connection con = DriverManager.getConnection(URL, username, password);
		
		CallableStatement CST = con.prepareCall("{call GetEmpId(?)}");
		CST.setInt(1, id);
		
	    
		ResultSet rt = CST.executeQuery();
		
		while(rt.next())
		{
		System.out.println ("Id is : " + rt.getInt(1) +" ");
		System.out.println ("Em_name is :" + rt.getString(2) +" ");
		System.out.println ("Em_salary is :"  + rt.getInt(3)+" ");
		System.out.println("CGPA is : " + rt.getBigDecimal(4) );
		}
		
		con.close();
		
	}
		//********************************************************************//
		//stored procedure out parameter
		
		public static void SPDwithInparameter() throws Exception
		{
			String URL = "jdbc:mysql:// localhost:3306/mysqldatabase";
			String username = "root";
			String password = "Santhosh@123";	
			
			int id =6;
			Connection con = DriverManager.getConnection(URL, username, password);
			
			CallableStatement CST = con.prepareCall("{call GetNameById(? , ? )}");
			CST.setInt(1, id);
			CST.registerOutParameter(2, Types.VARCHAR);
		    
			  CST.executeUpdate();
			  
			  System.out.println(CST.getString(2));
			con.close();	
	}
		
		//*********************************************************************//
		// update the salary value . and using commit and auto commit method 
		//commit vs auto commit
		
		public static void Commit() throws Exception
		{
			String URL = "jdbc:mysql:// localhost:3306/mysqldatabase";
			String username = "root";
			String password = "Santhosh@123";	
			
			String query1 = "update employe set salary = 550000 where emp_id =1";
			String query2 = "update employe set salary = 450000 where emp_id =2";

			
			Connection con = DriverManager.getConnection(URL, username, password);
			Statement st = con.createStatement();
			
			con.setAutoCommit(false);    //If the auto commit is off . why because of the if the update is true means it will update .
			 
			int rows1 = st.executeUpdate(query1);
			
			System.out.println("Rows one update " + rows1);

			int row2 = st.executeUpdate(query2);
			
			System.out.println("Rows two update "+ row2);
			
			if(rows1>0 && row2 >0)
			{
				con.commit();
			}
			con.close();	
			
	}
		
	//*****************************************************************************//
		
		// batch processing 
		// It is the combain of many work in to simple . 
		
		public static void Batchprocessing() throws Exception
		{
			String URL = "jdbc:mysql:// localhost:3306/mysqldatabase";
			String username = "root";
			String password = "Santhosh@123";	
			
			String query1 = "update employe set salary = 950000 where emp_id =1";
			String query2 = "update employe set salary = 850000 where emp_id =2";

			String query3 = "update employe set salary = 750000 where emp_id =3";
			String query4 = "update employe set salary = 650000 where emp_id =4";

			
			Connection con = DriverManager.getConnection(URL, username, password);
			Statement st = con.createStatement();
			st.addBatch(query1);
			st.addBatch(query3);
			st.addBatch(query3);
			st.addBatch(query4);
			
			int [] result  = st.executeBatch();
			
			for(int i : result )
			{
				System.out.println(" Rows affected" +i);
			}
			
			con.close();	
			
	}
		
		
		

}
