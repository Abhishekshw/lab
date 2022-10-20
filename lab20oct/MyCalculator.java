package Exeption.lab20oct;

/*Create a class MyCalculator which consists of a single method long power(int, int).
This method takes two integers, n and p, as parameters and finds n^p . If either n or
p is negative, then the method must throw an exception which says "n or p should
not be negative.". Also, if both n and p are zero, then the method must throw an
exception which says "n and p should not be zero."
Input Format
Each line of the input contains two integers, n and p.
Constraints
-10 < n < 10
Lab Session 20th oct 2022
-10 < p < 10
Output Format
Each line of the output contains the result, if both n and p are positive. If either n or p
is negative, the output contains "n and p should be non-negative". If both n and p are
zero, the output contains "n and p should not be zero.".
Sample TestCase 1
Input
12 2
2 10
0 0
2 -1
Output
144
1024
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.*/
import java.util.Scanner;//importing Scanner 

public class MyCalculator {
	public long power(int n, int p) throws Exception {// long method as Question
		if (n == 0 || p == 0) {// Condition as in Question
			throw new Exception("n and p should not be zero");
		} else if (n < 0 || p < 0) {// Condition as in Question
			throw new Exception("n and p should not be Negitive");
		} else
			return (long) (Math.pow(n, p));// casting int to long
	}

	public static void main(String[] args) throws Exception {
		Scanner S = new Scanner(System.in);// Scanner obj
		System.out.println("enter base");// Asking for input
		int n = S.nextInt();// Storing value
		System.out.println("enter power");// Asking for input
		int p = S.nextInt();// Storing value
		MyCalculator M = new MyCalculator();// obj of main class MyCalculator
		System.out.println(M.power(n, p));
	}
}
