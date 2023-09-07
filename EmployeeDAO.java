package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import Mypackage.DB;
import Mypackage.Employee;
import Mypackage.Query;

public class EmployeeDAO {
	
	public static String table = "Employee";
	

	public static ArrayList<Employee> readAll() throws SQLException {
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		Connection conn = DB.connect();
		String query = Query.ReadData(table);
		Statement statement = conn.prepareStatement(query);
		System.out.println("\n st ="+ statement);
		ResultSet res = statement.executeQuery(query);
		
		while (res.next()) {
			Employee emp = new Employee(res.getString(1),res.getString(2), res.getString(3), res.getInt(4), res.getLong(5),
					res.getString(6), res.getString(7));
			emplist.add(emp);
		}
		conn.close();
		return emplist;
	}

    public static void createData(Employee employee,String table) throws SQLException {
    	Connection conn = DB.connect();
    	String query = Query.Createdata(table);
    	PreparedStatement psmt = conn.prepareStatement(query);
    	psmt.setString(1, employee.getid());
    	psmt.setString(2, employee.getname());
    	psmt.setString(3, employee.getsex());
    	psmt.setInt   (4, employee.getage());
    	psmt.setLong  (5, employee.getphnno());
    	psmt.setString(6, employee.getemail());
    	psmt.setString(7, employee.getshift());
    	System.out.println("\n ps = "+ psmt);
    	psmt.executeUpdate();
    	psmt.close();
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
  
