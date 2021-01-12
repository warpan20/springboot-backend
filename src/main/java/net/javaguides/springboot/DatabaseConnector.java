package net.javaguides.springboot;
import java.sql.*;
public class DatabaseConnector {

	public static void main(String args[]) {
		try {
Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","archita#123");
PreparedStatement myStatement = myConn.prepareStatement("CREATE TABLE Persons (\r\n"
		+ "    PersonID int,\r\n"
		+ "    LastName varchar(255),\r\n"
		+ "    FirstName varchar(255),\r\n"
		+ "    Address varchar(255),\r\n"
		+ "    City varchar(255)\r\n"
		+ "); ");	

myStatement.executeUpdate();

/*while(myResult.next()) {
	System.out.println(myResult.getString("value"));
}
*/
		}
		catch(Exception exc)
		{
			exc.printStackTrace(); 
		}
		

}
}
