//Write a Java program to convert minutes into a number of years and days
package lab;
public class time {
	public static void main(String[]args ) {
		int minutes= 3456789; // value or input
				int day= minutes/(24*60);//logic
		int year=day/365;// logic
		System.out.println("days=" + day);//output
		System.out.println("year  =" + year);//output
	}

}
