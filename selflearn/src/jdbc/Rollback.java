package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Rollback {

	public static void main(String[] args) throws Exception  {
		 rollback();
	}
	
	//****************************************************************//
	public static void rollback() throws Exception
	{
			String URL = "jdbc:mysql:// localhost:3306/mysqldatabase";
			String username = "root";
			String password = "Santhosh@123";	
			
			String query1 = "update employe set salary = 450000 where emp_id =1";
			String query2 = "update employe set salary = 550000 where emp_id =2";

			String query3 = "update employe set salary = 350000 where emp_id =3";
			String query4 = "update employe set salary = 250000 where emp_id =5";

			
			Connection con = DriverManager.getConnection(URL, username, password);
			Statement st = con.createStatement();
			con.setAutoCommit(false);
			st.addBatch(query1);
			st.addBatch(query3);
			st.addBatch(query3);
			st.addBatch(query4);
			
			int [] result  = st.executeBatch();
			
			for(int i : result )
			{
				if(i>0)
				{
					continue;
				}
				else
				{
					con.rollback();
				}

			}
			con.commit();
			
			con.close();	
			
	}
	
	//******************************************************************************//

}
