package Dec1lab;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.student.Helper;

public class PFCalculation {
	static public void calculatePF(int emp_id) throws SQLException {

		Connection conn = Helper.con();// creating connection from helper class
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from employee where employee_id=" + emp_id);
		// it will return only
		// one row

		while (rs.next()) {
			if (rs.getInt(4) > 1000 && rs.getInt(4) < 10000) {// our 4 th column is Salary so wehave written rs.get(4)
				double salary = rs.getInt(4) * 1.05;// logic for pf as question
				System.out.println(" Employee PF amount is " + salary);
			}
			if (rs.getInt(4) > 10000 && rs.getInt(4) < 100000) {
				double salary = rs.getInt(4) * 1.06;// logic for pf as question
				System.out.println(" Employee PF amount is " + salary);
			}

			if (rs.getInt(4) > 100000) {
				double salary = rs.getInt(4) * 1.07;// logic for pf as question
				System.out.println(" Employee PF amount is " + salary);
			}
		}
	}
}
