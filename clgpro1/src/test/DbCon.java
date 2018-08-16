package test;
import java.sql.*;
public class DbCon{
	private static Connection con;
	static
	{try{
			Class.forName("com.mysql.jdbc.Driver");	
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client","root","");
		
		 	
	}
	catch(Exception e){e.printStackTrace();}
	}
	public static Connection getCon()
	{
		return con;
	}

}
