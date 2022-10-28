package Thread.lab;

/*Problem code 3:
write a method called addTwoPositive that takes two int
parameters, and if either value is not positive, throw an
ArithmeticException, passing the string "Non-positive
integer sent". to the constructor of the exception.if the
values are both positive, then return the sum of them .under
 what curcumstrance will the the finally
code will be exicuted in try/catch/finally*/
import java.util.Scanner;

public class PositiveSum {
	void addTwoPositive(int num1, int num2) {// method as per Question
		if (num1 < 0 || num2 < 0) {// Condition for Exception
			throw new ArithmeticException("non positive integer Send");
		} else {
			System.out.println("sum is =" + (num1 + num2));// output
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner S = new Scanner(System.in);// creating scanner obj
		System.out.println("enter 1st number");// asking For input
		int num1 = S.nextInt();// Storing input
		System.out.println("enter 2nd number");// asking For input
		int num2 = S.nextInt();// Storing input
		PositiveSum Add = new PositiveSum();
		Add.addTwoPositive(num1, num2);// passing the values to method
		// use of finally
		try {
			int x = 5;
			int y = 2;
			System.out.println(x / y);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always Exicuted found exception or not it will exicute");
		}
	}
}
