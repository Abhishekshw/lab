package lab_13_oct;

/*Problem Statement 1:
Write a program which creates a String “Welcome to Java World” and performs the following 
•	Returns the character at 5th position and display it.
•	Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
•	Concatenates “- Let us learn” to the above string and display it.
•	Returns the position of the first occurrence of character ‘a’ and display it.
•	Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
•	Returns string between 4th position and 10th position and display it.
•	Returns the lowercase of the string and display it.

Problem Statement 2:
Write a program which creates a StringBuffer “This is StringBuffer” and performs the following. 
1.	Adds the string ”- This is a sample program” to existing string and display it.
2.	Inserts the string “Object” into the existing string at 21st postion and display it.
3.	Reverses the entire string and displays it.
4.	Replaces the word “Buffer” with “Builder” and display it.

Problem Statement 3:
Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.
Drive: c:\
Folders: IBM || DB2 || PROGRAM 
File: DB2COPY1.EXE
*/
import java.util.StringTokenizer;

public class String1 {
	public static void main(String[] args) {
		// problem statment one started
		String s1 = "welcome to java World";
		System.out.println("5th posion of: " + s1 + " is " + s1.charAt(4));// fifth position
		String s2 = "welcome";
		int res = s1.compareToIgnoreCase(s2);// compairing
		if (res < 0) {
			System.out.println("\"" + s1 + "\"" + " is less than " + "\"" + s2 + "\"");
		} else if (res == 0)
			System.out.println("\"" + s1 + "\"" + " is equal " + "\"" + s2 + "\"");
		else
			System.out.println("\"" + s1 + "\"" + " is grater  than " + "\"" + s2 + "\"");
		String s3 = "-let us learn";
		System.out.println(s1 + s3);// concanating
		System.out.println("the postion of frist a is: " + (s1.indexOf("a") + 1));// 1st occurance of a
		System.out.println("replace string is: " + s1.replace("a", "e"));// replace a with e
		System.out.println(" string between 4 position to 10 :" + s1.substring(3, 9));// String between 4 and 10
																						// position
		System.out.println("string in lower case is: " + s1.toLowerCase());// lowecse
		// problem 2
		StringBuffer S = new StringBuffer("this is StringBuffer");// created stringbuffer
		S.append("This is simple program");// Added string This is simple program
		System.out.println("Added StringBuffer is: " + S);
		S.reverse();// reversing it
		System.out.println("reverse StringBuffer: " + S);
		S.reverse();// again reversing it to get actual string
		S.replace(14, 20, "Builder ");// replacing buffer to builder
		System.out.println("After replacing Buffer to Builder: " + S);
		// problem 3

		String Str = "C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";// creating string
		StringTokenizer t = new StringTokenizer(Str);// passing string in String tokenizer
		while (t.hasMoreTokens()) {
			System.out.println("Drive: " + t.nextToken("\\"));// breaking as of coundition
			System.out.println(
					"folders: " + (t.nextToken("\\")) + "||" + (t.nextToken("\\")) + "||" + (t.nextToken("\\")));
			System.out.println("file: " + t.nextToken("\\"));
		}
	}
}
