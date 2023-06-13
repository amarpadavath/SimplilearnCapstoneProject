package connectivity;

import java.sql.Connection;
import java.sql.SQLException;

import connectivity.DBConnectivityTransaction;

public class EmployeeInsertionFix

{

	
	 public static void transactin()
	    {
	    	Connection con = null;
	    	try
	    	{
	    		con = DBConnectivityTransaction.getConnection();
	    		//set auto commit to false
	    		con.setAutoCommit(false);
	    		EmployeeInsertionExample.insertCategory(con, "Antibiotics Achu", "This is for inhibiting germ growth", "CAT_4.png", true);
	    	//commit to trasaction
	    		con.commit();
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    		try
	    		{
	    			con.rollback();
	    			System.out.println("jdbc trasaction rolled back successfully");
	    		}
	    		catch(SQLException e1)
	    		{
	    			System.out.println("SQL exception in roll back"+e1.getMessage());
	    		}
	    	}
	    	finally
	        {
	            try
	            {
	                if(con!=null)
	                {
	                    con.close();
	                }
	            }
	            catch(SQLException e)
	            {
	                e.printStackTrace();
	           
	            }

	        }

	    }
}
