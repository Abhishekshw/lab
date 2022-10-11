package Array;

//write a java program to test if an array containts Specic value
import java.util.Scanner;

public class ElementPresence {
	public static void main(String[] args) {
		int count = 0;// variable count
		Scanner S = new Scanner(System.in);// Scanner object
		int a[] = { 10, 25, 57, 24, 95, 45 };// Array created
		System.out.println("enter the number which is you want check");
		int Input = S.nextInt();// input to check
		for (int i = 0; i < a.length; i++) {
			if (Input == a[i]) {// if loop for cheking condidtion
				count++;
			}
		}
		if (count > 0) {
			System.out.println("true");
		} else
			System.out.println("false");
	}
}
