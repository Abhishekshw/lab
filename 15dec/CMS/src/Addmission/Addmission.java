package Addmission;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class User_Not_Found extends Exception {// Exception class
	User_Not_Found(String msg) {
		super();
		System.out.println("user not found");
	}
}

class InvalidPassword extends Exception {// Exception class
	InvalidPassword(String msg) {
		super();
		System.out.println("passwors not match");

	}
}

class Criteria_not_match extends Exception {// Exception class
	Criteria_not_match(String m) {
		super();
		System.out.println("overAll martks Should 70/ year of passing should be current year ");
	}
}

public class Addmission {
	static int dataid;
	static int count;
	static String pass = null;

	public static void addmission() throws SQLException {

		Scanner S = new Scanner(System.in);
		// Storing values from user
		System.out.println("enter id");
		int id = S.nextInt();
		System.out.println("enter 10th marks");
		int Tmarks = S.nextInt();
		System.out.println("enter 12th marks");
		int Thmarks = S.nextInt();
		System.out.println("enter password");
		String password = S.next();
		System.out.println("enter year of passing");
		int yop = S.nextInt();
		Connection conn = main.Helper.con();// getting connection by helper class
		Statement stmt1 = conn.createStatement();
		Statement stmt2 = conn.createStatement();
		ResultSet rs2 = stmt1.executeQuery("Select pass from cms where Regi_id=" + id);
		ResultSet rs3 = stmt2.executeQuery("Select * from cms");

		while (rs3.next()) {
			dataid = (rs3.getInt(1));
			if (id == dataid) {// chekingid is Avaible or not
				count++;
				try {
					while (rs2.next()) {
						pass = rs2.getString(1);

						if (pass.equals(password)) {// Cheking password
							if (Tmarks >= 70 && 100 > Tmarks && Thmarks >= 70 && Thmarks < 100 && yop == 2022) {// chekling
																												// criteriya

								System.out.println("select course to addmission");
								System.out.println("press 1 for IT");
								System.out.println("press 2 for EE");
								System.out.println("press 3 for CS");
								System.out.println("press 4 for BCA");
								System.out.println("press 5 for MCA");
								int in = S.nextInt();
								switch (in) {
								case 1:
									stmt1.executeUpdate("update cms set course='  " + "it" + "  'where course=" + id);
								case 2:
									stmt1.executeUpdate(
											"update cms set course='  " + "b.tech in EE" + "  'where course=" + id);
								case 3:
									stmt1.executeUpdate(
											"update cms set course='  " + "b.tech in cs" + "  'where course=" + id);
								case 4:
									stmt1.executeUpdate("update cms set course='  " + "BCA" + "  'where course=" + id);
								case 5:
									stmt1.executeUpdate("update cms set course='  " + "MCA" + "  'where course=" + id);
									Default: System.out.println("wrong input");
									break;
								}
							} else {
								throw new Criteria_not_match("");
							}
						} else {
							throw new InvalidPassword("");

						}
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}

		}

	}
}
