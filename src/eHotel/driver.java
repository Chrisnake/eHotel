package eHotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

	public class driver {
	
	protected ResultSet rs;
	protected static String url = "jdbc:mysql://localhost:3306/eHotels";
	
	public static void main(String args[]) 
	{
		try 
		{
			ResultSet rs;
			Connection con = DriverManager.getConnection(url,"root","Simpson1723");
			Statement select = con.createStatement();

			rs = select.executeQuery("SELECT * FROM users");
			while (rs.next()) 
			{
				System.out.println(rs.getString(1)); //gets the first column's rows.
			}

			rs.close();
		} catch (Exception e) {System.out.println(e);}  
	}
	
	public void updateTowels(String currentTime, String userDetails) //With the current time and userdetails, will update the database to show when towels were requested and which room requested them.
	{
		String update = userDetails + ": Towel Request at " + currentTime;
		try 
		{
			Connection con = DriverManager.getConnection(url,"root","Simpson1723");
			String query = "INSERT INTO Staff (services)" + " values (?)";
			
			//Create the preparted statement for the values to be inputted
		    PreparedStatement preparedStmt = con.prepareStatement(query);
		    preparedStmt.setString(1, update);
		    preparedStmt.execute();
		    
		} catch (Exception e1) {System.out.println(e1);}
		System.out.println("DATABASE SUCCESSFULLY UPDATED");
	}
	
	public void updateClean(String currentTime, String userDetails) //With the current time and userdetails, will update the database to show when room cleans are requested and which room requested them.
	{
		String update = userDetails + ": Room Clean Request at " + currentTime;
		try 
		{
			Connection con = DriverManager.getConnection(url,"root","Simpson1723");
			String query = "INSERT INTO Staff (services)" + " values (?)";
			
			//Create the preparted statement for the values to be inputted
		    PreparedStatement preparedStmt = con.prepareStatement(query);
		    preparedStmt.setString(1, update);
		    preparedStmt.execute();
		    
		} catch (Exception e1) {System.out.println(e1);}
		System.out.println("DATABASE SUCCESSFULLY UPDATED");
	}
	
	public ArrayList<String> getUpdates() //Checks the database for a match in the login and password from the user input
	{
		ArrayList<String> updates = new ArrayList<String>();
		try 
		{
			Connection con = DriverManager.getConnection(url,"root","Simpson1723");
			String query = "SELECT services FROM Staff";
			PreparedStatement ps = con.prepareStatement(query);
	        ResultSet results = ps.executeQuery(query); //where ps is Object of PreparedStatement
	     	
	        while(results.next()) 
	        {
	        	updates.add(results.getString(1));
	        } 
	        results.close();
		} catch (Exception e1) {System.out.println(e1);}
		return updates;
	}
	
	public String currentTime() //Gets the current time when accessed and returns it in a form of a string.
	{
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		return(timeStamp);
	}
}


