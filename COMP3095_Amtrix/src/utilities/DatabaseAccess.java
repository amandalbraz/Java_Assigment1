package utilities;

import java.sql.Connection;
import java.sql.DriverManager;

private String username = "admin@domain.ca";;
private String password = "P@ssword1";
private String database = "COMP3095";

public class DatabaseAccess {
	
	 private static Connection connect = null;
	 public static Connection connectDataBase() throws Exception {
		    try {
		      // This will load the MySQL driver, each DB has its own driver
		      Class.forName("com.mysql.jdbc.Driver");
		      // Setup the connection with the DB
		      connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/"+database+"?"
			              + "user="+username+"&password="+password);
		      return connect;
		    } catch (Exception e) {
		      throw e;
		    } 
		  }
}
