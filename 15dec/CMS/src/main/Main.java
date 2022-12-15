package main;

import java.sql.SQLException;

import Login.Login;
import Registration.Registration;

public class Main {
	public static void main(String[] args) throws SQLException {
		try {
			Registration r = new Registration();
			Login l = new Login();
			r.Registration();
			// l.login();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
