package main;

import java.sql.SQLException;
import java.util.Scanner;

import Addmission.Addmission;
import Login.Login;
import Registration.Registration;

public class Main {
	static int in;

	public static void menu() {
		System.out.println("press 1 for Registration");
		System.out.println("press 2 for login");
		System.out.println("press 3 for Addmission");
		System.out.println(" 5 for exit");
	}

	public static void main(String[] args) throws SQLException {
		Scanner S = new Scanner(System.in);// Scanner obj

		// giving option to user

		do {
			menu();
			// taking input
			int in = S.nextInt();
			switch (in) {// using switch case we will do menu draw
			case 1:
				try {
					Registration.Registration();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
				break;
			case 2:
				Login.login();
				break;
			case 3:
				Addmission.addmission();
				;
				break;

			default:
				System.out.println("wrong input");

			}
		} while (in != 5);
	}
}
