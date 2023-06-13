package connectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectivity.DBConnectivityTransaction;

public class EmployeeInsertionExample {
	
	//inthis example we are seeing transaction query- insert employee data employee address
	 public static String INSERT_CATEGORY_QUERY="INSERT INTO Category (name, description,image_url,is_active) VALUES (?, ?, ?, ?)";
	//public static String INSERT_EMPLOYEE_QUERY ="insert into employee (empid,name) values(?,?)";
   // public static String INSERT_ADDRESS_QUERY ="insert into address(empid,address,city,country) values(?,?,?,?)";
    //method to inseart employee data
    public static void insertCategory(Connection con, String name, String description, String image_url, boolean is_active ) throws SQLException
    {
    	
    	PreparedStatement stmt = con.prepareStatement(INSERT_CATEGORY_QUERY);
    	stmt.setString(1, name);
    	stmt.setString(2, description);
    	stmt.setString(3, image_url);
    	stmt.setBoolean(4, is_active);
    	stmt.executeUpdate();
    	System.out.println("Craeted category" );
    	stmt.close();
    	
    }
    
 
    
    
 
    
    public static void Insertion()
    {
    	Connection con = null;
    	try
    	{
    		con = DBConnectivityTransaction.getConnection();
    		//insertEmployeeData(con, 1 , "Deepak");
    		insertCategory(con, "Antibiotics Achu", "This is for inhibiting germ growth", "CAT_4.png", true);
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
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

