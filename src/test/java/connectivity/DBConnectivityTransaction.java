package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectivityTransaction {
	

    public static String INSERT_CATEGORY_QUERY="INSERT INTO Category (name, description,image_url,is_active) VALUES (?, ?, ?, ?)";
 

    public static String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
    public static String DB_URL="jdbc:mysql://localhost:3306/medicare";
    public static String DB_UserID="root";
    public static String DB_Password="Amarpv11#";
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        //Load the driver clas file
        
        Class.forName(DB_DRIVER_CLASS);
        
        con = DriverManager.getConnection(DB_URL,DB_UserID,DB_Password);
        System.out.println("DB Connection created successfully");
        
        return con;
}

}
