package Lab_17_nov;

//wajp to replace an element in linked list
import java.util.LinkedList;//importing link list

public class ReplaceElement {
	public static void main(String[] args) {
		LinkedList<String> Ll = new LinkedList<String>();// creating object of link list
		Ll.add("Ram");// Adding value
		Ll.add("Shyam");
		Ll.add("laxman");
		Ll.add("bharat");
		Ll.add("Hanuman");
		System.out.println("list is" + Ll);// view original list
		Ll.set(2, "Replce");// replacing value
		System.out.println("replace list is" + Ll);// view replaced list
	}
}
