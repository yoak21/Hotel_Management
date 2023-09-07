package Database;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Mypackage.DB;
import Mypackage.Search;

import java.sql.Statement;

public class SearchDAO {
	
	 public static ArrayList<Search> getRoomStatus()throws SQLException {
		ArrayList<Search> list = new ArrayList<Search>();
		Connection conn = DB.connect();
		String query = "SELECT * FROM Room WHERE room_status == available ";
		Statement smt = conn.prepareStatement(query);
		System.out.println("\n st = "+ smt);
		ResultSet res = smt.executeQuery(query);
		while(res.next()) {
			Search sc = new Search(res.getString(1),res.getInt(2),res.getString(3),res.getInt(4), res.getString(5),res.getString(6));
			list.add(sc);
		}
		conn.close();
		return list;
	}
	 
	 public static ArrayList<Search> getBookingDetails(String id) throws SQLException {
		 ArrayList <Search> list = new ArrayList<Search>();
		 Connection conn = DB.connect();
		 String query = "Select * From Booking Where booking_id == ?";
		 PreparedStatement psmt = conn.prepareStatement(query);
		 psmt.setString(1, id);
		 System.out.println("\n st = "+psmt);
		 ResultSet res =  psmt.executeQuery(query);
		 while(res.next()) {
		    Search sc = new Search(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6));
		    list.add(sc);
		 }
		 conn.close();
		 return list;
	 }
	
	 public static ArrayList<Search> getCustomerDetails(String name, String mob) throws SQLException{
		      ArrayList<Search> List = new ArrayList<Search>();
		      Connection conn = DB.connect();
		      String query = "SELECT * FROM Customer WHERE cust_name == ? and  cust_mob == ?";
		      PreparedStatement psmt = conn.prepareStatement(query);
		      psmt.setString(1, name);
		      psmt.setString(2, mob);
		      System.out.println("\n st = "+psmt);
		      ResultSet res =  psmt.executeQuery(query);
		      while(res.next()) {
				    Search sc = new Search(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7));
				    List.add(sc);
				 }
		      conn.close();
		      return List;
	 }
}
