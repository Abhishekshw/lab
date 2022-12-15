package Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class User_Not_Found extends Exception {// exeption class
	User_Not_Found(String msg) {
		super();
		System.out.println("user not found");
	}
}

class InvalidPassword extends Exception {// exeption class
	InvalidPassword(String msg) {
		super();
		System.out.println("passwors not match");

	}
}

public class Login {
	static int id;// instance veriable
	static String password;
	static int dataid;
	static String pass;

	public static void login() throws SQLException {// methods
		int count = 0;
		Scanner S = new Scanner(System.in);// Scanner object
		System.out.println("enter your id");// Asking user for value
		id = S.nextInt();// Storing value
		System.out.println("Enter your password");
		password = S.next();
		Connection conn = main.Helper.con();// getting connection by helper class
		Statement stmt1 = conn.createStatement();
		Statement stmt2 = conn.createStatement();
		ResultSet rs2 = stmt1.executeQuery("Select pass from cms where Regi_id=" + id);// Exicuting Sql command
		ResultSet rs3 = stmt2.executeQuery("Select * from cms");

		while (rs3.next()) {
			dataid = (rs3.getInt(1));
			if (id == dataid) {
				count++;
			}

		}
		try {
			if (count == 0) {
				throw new User_Not_Found("");// if not match it will trow an error
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			while (rs2.next()) {
				pass = rs2.getString(1);
				System.out.println(pass);
				if (password.equals(pass)) {// cheeking password
					ResultSet rs1 = stmt1.executeQuery("Select course from cms where Regi_id=" + id);

					if (rs1 != null) {
						System.out.println("you have taken addmission in" + rs1);
					} else {
						System.out.println("your are Student not taken addmission");
					}

				} else {

					throw new InvalidPassword("");// custom ecxeption thrown
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
