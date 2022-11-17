package Lab_17_nov;

//,Wajp to Extrect apostion of arrayList
//importing util pakage
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtactApostionInAArraylist {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);// Scanner Obj
		ArrayList<String> Al1 = new ArrayList<String>();// Arraylist obj
		Al1.add("Red");// Adding object
		Al1.add("Green");
		Al1.add("Orange");
		Al1.add("White");
		Al1.add("Black");
		System.out.println("current ArrayListy is " + Al1);// view Array list
		System.out.println("Enter Start position of  Extraction");
		int StratPosition = S.nextInt();// Asking forStarting position
		System.out.println("Enter last position Of Extaction want to Extract");
		int LastPosition = S.nextInt();// Asking for upto position
		List<String> Al2 = Al1.subList((StratPosition - 1), LastPosition);// craeting list for
		System.out.println(Al2);
	}
}
