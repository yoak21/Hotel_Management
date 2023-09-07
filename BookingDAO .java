package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Mypackage.Booking;
import Mypackage.DB;
import Mypackage.Query;

public class BookingDAO {
	
	static String table = "Booking";

	public static void createData(Booking book) throws SQLException {

		Connection conn = DB.connect();
		String query = Query.Createdata(table);
		PreparedStatement psmt = conn.prepareStatement(query);
		psmt.setString(1, room.getid());
		psmt.setInt(2, room.getroomno());
		psmt.setString(3, room.getstatus());
		psmt.setInt(4, room.getprice());
		psmt.setString(5, room.getstatus());
		System.out.println("/n ps =" + psmt);
		psmt.executeUpdate();
		conn.close();
	}

	public static ArrayList<Room> readAll() throws SQLException {
		ArrayList<Room> roomlist = new ArrayList<Room>();
		Connection conn = DB.connect();
		String query = Query.ReadData(table);
		Statement smt = conn.prepareStatement(query);
		System.out.println("/n ps =" + smt);
		ResultSet res = smt.executeQuery(query);
		while (res.next()) {
			Room sc = new Room(res.getString(1), res.getInt(2), res.getString(3), res.getInt(4), res.getString(5));
			roomlist.add(sc);
		}
		conn.close();
		return roomlist;
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
