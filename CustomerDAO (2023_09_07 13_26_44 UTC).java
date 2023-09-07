package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Mypackage.Customer;
import Mypackage.DB;
import Mypackage.Query;


public class CustomerDAO {
	public static String table = "Customer";
	
	public static ArrayList<Customer> readAll() throws SQLException{
		
		ArrayList<Customer> custlist = new ArrayList<Customer>();
		Connection conn = DB.connect();
		String query = Query.ReadData(table);
		Statement smt = conn.prepareStatement(query);
		ResultSet res = smt.executeQuery(query);
		while(res.next()) {
			Customer cust = new Customer(res.getString(1),res.getString(2), res.getInt(3), res.getString(4), res.getInt(5), res.getString(6), res.getString(7), res.getString(7));
			custlist.add(cust);
		}
		conn.close();
		return custlist;
	}
	
	public static void createData(Customer customer,String table) throws SQLException{
		Connection conn = DB.connect();
		String query = Query.Createdata(table);
		PreparedStatement psmt = conn.prepareStatement(query);
		psmt.setString(1, customer.getid());
		psmt.setString(2, customer.getname());
		psmt.setString(3, customer.getsex());
		psmt.setInt   (4, customer.getage());
		psmt.setString(5, customer.getphnno());
		psmt.setString(6, customer.getemail());
		psmt.setString(7, customer.getbookingid());
        psmt.executeUpdate();
        conn.close();
	}
	public static void updateData(String column, String value, String roomid, String value2) throws SQLException {
		Connection conn = DB.connect();
		String query = Query.Updatedata(table);
		PreparedStatement psmt = conn.prepareStatement(query);
        psmt.setString(1, column);
        psmt.setString(2, value);
        psmt.setString(3, roomid);
        psmt.setString(4, value2);
        System.out.println("/n ps =" + psmt);
        psmt.executeUpdate();
        conn.close();
	}
	
	public static void deleteData(String row, String value) throws SQLException{
		Connection conn = DB.connect();
		String query = Query.Deletedata(table);
		PreparedStatement psmt = conn.prepareStatement(query);
		psmt.setString(1, row);
		psmt.setString(2, value);
		System.out.println("/n ps =" + psmt);
		psmt.executeUpdate();
		conn.close();
	}
}
