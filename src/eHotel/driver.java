package eHotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JTextArea;

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
	
	public void updateOrders(String currentTime, String userRoom, String userOrder) //Updates the food orders given by the user
	{
		String update = "ROOM" + userRoom + ": Food Order:  " + userOrder + " at " + currentTime;
		try 
		{
			Connection con = DriverManager.getConnection(url,"root","Simpson1723");
			String query = "INSERT INTO Orders (userOrder)" + " values (?)";
			
			//Create the preparted statement for the values to be inputted
		    PreparedStatement preparedStmt = con.prepareStatement(query);
		    preparedStmt.setString(1, update);
		    preparedStmt.execute();
		    
		} catch (Exception e1) {System.out.println(e1);}
		updateliveFeed(update, Staff.textArea); //Updates the livefeed manually. 
		System.out.println("DATABASE ORDER SUCCESSFULLY UPDATED");
	}
	
	public void updateTowels(String currentTime, String userRoom) //With the current time and userRoom, will update the database to show when towels were requested and which room requested them.
	{
		String update = userRoom + ": Towel Request at " + currentTime;
		try 
		{
			Connection con = DriverManager.getConnection(url,"root","Simpson1723");
			String query = "INSERT INTO Staff (services)" + " values (?)";
			
			//Create the preparted statement for the values to be inputted
		    PreparedStatement preparedStmt = con.prepareStatement(query);
		    preparedStmt.setString(1, update);
		    preparedStmt.execute();
		    
		} catch (Exception e1) {System.out.println(e1);}
		updateliveFeed(update, Staff.textArea); //Updates the livefeed manually. 
		System.out.println("DATABASE TOWEL SUCCESSFULLY UPDATED");
	}
	
	public void updateClean(String currentTime, String userRoom) //With the current time and userdetails, will update the database to show when room cleans are requested and which room requested them.
	{
		String update = userRoom + ": Room Clean Request at " + currentTime;
		try 
		{
			Connection con = DriverManager.getConnection(url,"root","Simpson1723");
			String query = "INSERT INTO Staff (services)" + " values (?)";
			
			//Create the preparted statement for the values to be inputted
		    PreparedStatement preparedStmt = con.prepareStatement(query);
		    preparedStmt.setString(1, update);
		    preparedStmt.execute();
		    
		} catch (Exception e1) {System.out.println(e1);}
		updateliveFeed(update, Staff.textArea); //Updates the livefeed manually. 
		System.out.println("DATABASE CLEAN SUCCESSFULLY UPDATED");
	}
	
	public ArrayList<String> getUpdates() //gets the updates from the database when called
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
	
	public void updateliveFeed(String update, JTextArea area) //Updates the live feed when a new value is inserted into the database.
	{
		area.append(update + "\n");	
	}
	
	public String currentTime() //Gets the current time when accessed and returns it in a form of a string.
	{
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		return(timeStamp);
	}
}


