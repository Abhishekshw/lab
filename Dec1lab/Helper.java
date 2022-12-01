package Dec1lab;

/*After completing the hands-on exercises, you will be able to:
•	Use JDBC for performing DML related operations in Java applications.
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Helper {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// registering my sql driver
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection con() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb", "root", "root");

	}

	public static void main(String[] args) throws SQLException {
		Scanner Sc = new Scanner(System.in);// Scanner object
		StoreData S = new StoreData();// object of classes
		SearchEmp Se = new SearchEmp();
		PFCalculation Pf = new PFCalculation();
		S.storeDepartrmentDetails();
		S.storeEmployeeDetails();
		System.out.println("enter emp ehich details you want to check ?");
		int in = Sc.nextInt();// Asking user for value
		Se.retrieveEmployeeDetails(in);// method calling by passing value
		System.out.println("enter the emp id for checck pf ");
		int pfch = Sc.nextInt();// Asking user for value
		Pf.calculatePF(pfch);// method calling by passing value
	}
}
