package lab_sept29;

//a Java program to find all pairs of elements in an array whose sum is
//equal to a specified number
import java.util.Scanner;

public class SumOF {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("enter no");
		int b = S.nextInt();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 10, 12, 15, 16, 18 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == b) {
					System.out.println("if you add " + arr[i] + " and " + arr[j] + " will give " + b);
				}
			}
		}
	}
}
