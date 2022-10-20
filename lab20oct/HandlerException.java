package Exeption.lab20oct;

/*You are given a piece of Java code. You have to complete the code by writing down the handlers
for exceptions thrown by the code. The exceptions the code may throw along with the handler
message are listed below:
Division by zero: Print "Invalid division".
String parsed to a numeric variable: Print "Format mismatch".
Accessing an invalid index in string: Print "Index is invalid".
Accessing an invalid index in array: Print "Array index is invalid".
MyException: This is a user defined Exception which you need to create. It takes a
parameter param. When an exception of this class is encountered, the handler should print "My
Exception[param]", here param is the parameter passed to the exception class.
Exceptions other than mentioned above: Any other exception except the above ones fall in this
category. Print "Exception encountered".
Finally, after the exception is handled, print "Exception Handling Completed".*/
import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception {// creating onw exeption
	MyException(String param) {
		super(param);
	}
}

public class HandlerException {// main class
	private static Object countinue;

	public static void main(String[] args) {
		String Str = "Ram";// string value
		Scanner S = new Scanner(System.in);
		try {
			System.out.println("Enter 1St no");
			int num1 = S.nextInt();// asking for value
			System.out.println("Enter 1St no");
			int num2 = S.nextInt();// asking for value
			System.out.println("the Division is " + (num1 / num2));
			System.out.println(Str.charAt(4));
			int Array[] = { 5, 4, 8, 7, 3, 1, 2 };
			System.out.println(Array[9]);// array out of index Exception
			throw new MyException("Exception Encounter");
//catchmethod for diffrent Excepion
		} catch (ArithmeticException e) {
			System.out.println("invalid Division");
		} catch (InputMismatchException ex) {
			System.out.println("format  mismatch");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("index is invalid");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Array index is invalid");
		} catch (Exception e) {
			System.out.println("Exception Encounter");
		} finally {
			System.out.println("Exception heandling Completed");
		}

	}
}