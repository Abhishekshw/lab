package Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

class PasswordMustBeSixDegit extends Exception {
	PasswordMustBeSixDegit(String msg) {
		super();
	}

}

public class Registration {
	static String password;
	static int oldReg;

	public static void Registration() throws PasswordMustBeSixDegit, SQLException {
		Connection conn = main.Helper.con();// connection done from helper class
		Statement stmt1 = conn.createStatement();// create Statment
		Scanner S = new Scanner(System.in);

		Random rnd = new Random();// random class object
		int regnumber = rnd.nextInt(999999);
		System.out.println("enter your name");
		String name = S.nextLine();// Storing details

		System.out.println("enter your mobile numeber");
		long mobile = S.nextLong();
		System.out.println("enter password");
		password = S.next();
		System.out.println("enter your Address");
		String Add = S.next();
		if (password.length() == 6) {// cheking passwors length

			ResultSet rs = stmt1.executeQuery("Select * from cms");
			try {
				while (rs.next()) {
					oldReg = (rs.getInt(1));
					if (oldReg == regnumber) {// cheking registration number is avaible or not
						Registration();
					} else {
						PreparedStatement stmt = conn.prepareStatement("insert into cms values(?,?,?,?,?,?,?,?,?)");
						stmt.setInt(1, regnumber);// inserting values
						stmt.setString(2, password);
						stmt.setString(3, name);
						stmt.setString(4, Add);
						stmt.setLong(5, mobile);
						stmt.setString(6, null);
						stmt.setInt(7, 0);
						stmt.setInt(8, 0);
						stmt.setInt(9, 0);
						stmt.executeUpdate();
						System.out.println("Student Register created");
						System.out.println("your registraion  number is " + regnumber);
						break;
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}

		} else {
			throw new PasswordMustBeSixDegit("password must be 6 digit");
		}

	}

}
