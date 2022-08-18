//Write a Java program that accepts two integers from the user and then
//prints the sum, the difference, the product, the average, the distance (the
//difference between integer), the maximum (the larger of the two integers), the
//minimum (smaller of the two integers).
package lab;
import java.util.*;
public class Calculator {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 1st number");// output
		int a=scan.nextInt();//logic
		System.out.println("enter 2nd number");// output
		int b=scan.nextInt();
		int sum=a+b;//logic
		System.out.println("Sum of two integer:" + sum);// output
		int diff=a-b;//logic
		System.out.println("Diffrence of two integer: " + diff);// output
		int product=a*b;//logic
		System.out.println("Product of two integer:" + product);// output
		float avg=(a+b)/2f;//logic
		System.out.println("Avrage of two integer:" + avg);// output
		int dist=a-b;//logic
		System.out.println("Distance of two integer:" + dist);// output
		if (a<b) {//condition cheking
			System.out.println("Max integer " + b);// output
			System.out.println("Min integer " + a);}// output
		else{////condition cheking
			System.out.println("Max integer " + a);// output
			System.out.println("Min integer " + b);}}}// output
