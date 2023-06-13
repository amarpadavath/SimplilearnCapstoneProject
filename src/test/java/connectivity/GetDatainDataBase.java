package connectivity;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectivity.DBConnectivityTransaction;
public class GetDatainDataBase {
	
	
	public void test() {
		try{
			
		//	con.createStatement();
		String query = "select * from  Category";
		PreparedStatement stmt = DBConnectivityTransaction.getConnection().prepareStatement(query);
		// Get the contents of userinfo table from DB
		ResultSet res = stmt.executeQuery(query);
		// Print the result untill all the records are printed
		// res.next() returns true if there is any next record else returns false
		while (res.next())
		{
		System.out.print(res.getInt(1));
		System.out.print(" " + res.getString(2));
		System.out.print(" " + res.getString(3));
		System.out.print(" " + res.getString(4));
		System.out.println(" " + res.getBoolean(5));
		}
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		}

}
