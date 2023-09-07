package Mypackage;

public class Query {

	public static String query;

	public static String Createdata(String table) {
		if (table == "Employee") {
			return query = "INSERT INTO " + table + " VALUES (?,?,?,?,?,?,?)";
		} else if (table == "Customer") {
			return query = "INSERT INTO " + table + " VALUES (?,?,?,?,?,?,?,?)";
		} else if (table == "Room") {
			return query = "INSERT INTO " + table + " VALUES (?,?,?,?,?)";
		} else if (table == "Customer") {
			return query = "INSERT INTO " + table + " VALUES (?,?,?,?,?,?,?)";
		}
		else
		return query = "Table not present in the Database";
	}

	public static String Updatedata(String table) {
		return query = "UPDATE " + table + " SET ? = ? WHERE ? = ?";
	}

	public static String ReadData(String table) {
		return query = "SELECT * FROM " + table;
	}

	public static String Deletedata(String table) {
		return query = "DELETE FROM " + table + " WHERE ? = ?";
	}
}
