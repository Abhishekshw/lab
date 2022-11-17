package Lab_17_nov;

//wajp to insert an element in front of linked list
import java.util.LinkedList;

public class InsertIn_front_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> Ll = new LinkedList<String>();// creating object of link list
		Ll.add("Ram");// Adding value
		Ll.add("Shyam");
		Ll.add("laxman");
		Ll.add("bharat");
		Ll.add("Hanuman");
		System.out.println("list is" + Ll);// view original list
		Ll.add(0, "insert");// inserting value by index postion in frist
		Ll.addFirst("we can use this way too");// inserting value in frist value without index position
		System.out.println("replace list is" + Ll);// view replaced list
	}
}
