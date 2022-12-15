package Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class user_not_Found extends Exception {
	user_not_Found(String msg) {
		super();
	}
}

public class Login {
	int id;
	static String password;
	static int dataid, count;
	String pass;

	public void login() throws SQLException, user_not_Found {
		Scanner S = new Scanner(System.in);
		System.out.println("enter your id");
		id = S.nextInt();
		System.out.println("Enter your password");
		password = S.next();
		Connection conn = main.Helper.con();// getting connection by helper class
		Statement stmt1 = conn.createStatement();
		Statement stmt2 = conn.createStatement();
		ResultSet rs2 = stmt1.executeQuery("Select * from cms");
		ResultSet rs3 = stmt2.executeQuery("Select * from cms");

		while (rs3.next()) {
			dataid = (rs3.getInt(1));
			if (id == dataid) {// creating coustom exception
				count++;
			}
			if (count == 0) {
				throw new user_not_Found("user not found try again");// if not match it will trow an error
			}

		}
		while (rs2.next()) {
			pass = (rs2.getString(2));
			if (password == pass) {// creating coustom exception
				ResultSet rs1 = stmt1.executeQuery("Select course from cms where Regi_id=" + id);
			}
		}
	}
}
