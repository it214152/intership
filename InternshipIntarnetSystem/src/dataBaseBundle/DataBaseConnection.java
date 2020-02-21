package dataBaseBundle;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {

	
	private static String username="it214158";
	private static String password="05q%xrm9";
	
	private static String connectionString = "jdbc:mysql://localhost:3306/katanemina2020?allowPublicKeyRetrieval=true&useSSL=false";
	private static Connection connection;
	private static Statement command;
	//private static ResultSet data;
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		
		try {
			System.out.println("...2");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionString, username, password);
			command = connection.createStatement();
			System.out.println("Connection is successful !!!!!");
			
		}catch(SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			
		}//finally {
			//System.out.println("Success");
			
	//	}
		
		
		
	}
	
	
}