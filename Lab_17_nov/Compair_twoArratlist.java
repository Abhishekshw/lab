package Lab_17_nov;

//.Wajp to copair two arrayist
import java.util.ArrayList;

public class Compair_twoArratlist {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();// object of array list
		al.add("Red");
		al.add("Green");
		al.add("Black");
		al.add("White");
		al.add("Pink");
		ArrayList<String> al2 = new ArrayList<String>();// object of array list
		al2.add("Red");
		al2.add("Green");
		al2.add("Black");
		al2.add("Pink");
		for (int i = 0; i < al.size(); i++) {
			boolean b = al2.contains(al.get(i));// get i use to get element of index
			// and we cheking that element is avaible in al2 or not
			System.out.println(al.get(i) + " is in both Arrylist : " + b);
		}
	}
}
