package Dec1lab;

//importing required pakage
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.student.Helper;

public class SearchEmp {
	static int count;// veriable

	static public void retrieveEmployeeDetails(int Emp_id) throws SQLException {
		Connection conn = Helper.con();// creating connection from helper class
		Statement stmt = conn.createStatement();
		// exicuting fetch data from database
		ResultSet rs = stmt.executeQuery("Select * from employee where employee_id=" + Emp_id);// Quary for check
		// itteration
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4) + " "
					+ rs.getLong(5) + " " + rs.getInt(6));
			count++;// count is zero if no found match
		}
		if (count == 0) {// if blockexicute when emp_id not match
			System.out.println("id not found");
		}
	}
}
