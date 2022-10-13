package lab_13_oct;

//Write a Java program to find sequences of lowercase letters joined with a underscore.
import java.util.Scanner;
import java.util.regex.Pattern;//importing regex class

public class SequanceOfLowecase_WithUnderScore {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("enter String");
		String in = S.next();// taking input
		boolean b = Pattern.matches("[a-z]+_[a-z]+", in);// cheking matched or not
		if (b)
			System.out.println("found match");
		else
			System.out.println("found  not match");
	}
}
