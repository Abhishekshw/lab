package lab_sept29;

/*Write a Java method to check whether every digit of a given integer
is even. Return true if every digit is odd otherwise false?*/
import java.util.Scanner;

public class Alleven {
	public static void main(String[] args) {
		int count = 0;
		Scanner S = new Scanner(System.in);// Scanner obj
		System.out.println(" how many number you want to store");
		int b = S.nextInt();
		int a[] = new int[b];// new array
		for (int i = 0; i < a.length; i++) {// storing value
			System.out.println("enter the numbers");
			a[i] = S.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {// condition for even
				count++;
			}
		}
		if (count == b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
