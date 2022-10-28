package Thread.lab;

/*Problem code 3:
Take two numbers x and y. Throw the exception if the two numbers are negative else print
the Product of x and y.
Input Format -The only line of input consist of two integers, x and y.
Constraints 20<= x, y <=20
Output Format Print the product if both are positive else print the output as below:
java.lang.Exception: x and y should not be zero.*/
import java.util.Scanner;//importing Scanner object

public class Mutlitpy {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);// creating scanner obj
		System.out.println("enter x");// Asking for value
		int x = s.nextInt();// Storing values
		System.out.println("enter y");// Asking for value
		int y = s.nextInt();// Storing values
		if (-20 <= x && y <= 20) {// cheking limit of x and y
			if (x < 0 && y < 0) {// condition for Exception
				throw new Exception("x and y should not be negitive ");
			} else {
				{
					System.out.println("product is = " + (x * y));// output if condition Statisfied
				}
			}
		} else
			System.out.println("input Formate is not match");
	}
}
