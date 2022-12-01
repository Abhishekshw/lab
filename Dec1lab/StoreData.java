package Dec1lab;

import java.sql.Connection;
import java.sql.Statement;

import com.student.Helper;

public class StoreData {
	static public void storeEmployeeDetails() {
		try {
			Connection conn = Helper.con();// creating connection from helper class
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into Employee values (101,'abhi','Address 99',999,7076335254,2)");//its shows exception that -java.sql.SQLException: Check constraint 'employee_chk_1' is violated.
			stmt.executeUpdate("insert into Employee values (087,'Vikram','Address 1',12000,9878761212,2)");// inserting
																											// into data
			stmt.executeUpdate("insert into Employee values (110,'Ajay','Address 2',18000,9654376143,1)");
			stmt.executeUpdate("insert into Employee values (098,'Rajesh','Address 3',11000,9965322212,4)");
			stmt.executeUpdate("insert into Employee values (067,'Ram','Address 4',19000,8078343732,3)");
			stmt.executeUpdate("insert into Employee values (045,'Vimal','Address 5',27000,9932113221,4)");
			stmt.executeUpdate("insert into Employee values (987,'Kiran','Address 6',21000,7076337238,2)");
			// stmt.executeUpdate("insert into Employee values (987,'Kiran','Address
			// 6',21000,7076337238,2)");
			// its shows an error
			// -java.sql.SQLIntegrityConstraintViolationException:Duplicate entry '987' for
			// key 'employee.PRIMARY'
			// stmt.executeUpdate("insert into Employee values (123,'Ron','Address
			// 1',12000,972234651,99)");
			// its sows an error -java.sql.SQLIntegrityConstraintViolationException: Cannot
			// add or update a
			// child row: a foreign key constraint fails (`abhidb`.`employee`,
			// CONSTRAINT`employee_ibfk_1` FOREIGN KEY (`Department_ID`) REFERENCES
			// `department`(`Department_ID`))

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	static public void storeDepartrmentDetails() {
		try {
			Connection conn = Helper.con();// creating connection from helper class
			Statement stmt = conn.createStatement(); // statement
			stmt.executeUpdate("insert into Department values (1,'Account',	'Ramesh','Accounts Dept')");
			stmt.executeUpdate("insert into Department values (2,'Admin','Vijay','Admin Dept')");
			stmt.executeUpdate("insert into Department values (3,'Sales','Vinod','Sales Dept')");
			stmt.executeUpdate("insert into Department values (4,'HR','Mahesh','HR Dept')");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
