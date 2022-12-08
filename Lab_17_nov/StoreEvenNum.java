package Lab_17_nov;

/*1. Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store
even numbers from 2 to N, where N is a integer which is passed as a parameter to the
method storeEvenNumbers(). The method should return the ArrayList (A1) created.
2. In the same class create a method printEvenNumbers()which iterates through the
arrayList A1 in step 1, and It should multiply each number with 2 and display it in format
4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2)
created needs to be returned.
3. Create a method retrieveEvenNumber(int N) parameter is a number N. This method
should search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it
should return the Number else return zero.
Hint: Use instance variable for storing the ArrayList A1 and A2.
NOTE: You can test the methods using a main method*/
import java.util.ArrayList;//importing Arraylist file

public class StoreEvenNum {
	ArrayList<Integer> A1 = new ArrayList<Integer>();// Arraylist object A1
	ArrayList<Integer> A2 = new ArrayList<Integer>();// Arraylist object A2

	ArrayList storeEvenNumber(int N) {// storeEvenNumber methoh As question
		for (int i = 2; i < N; i++) {
			if (i % 2 == 0) {// logic of even number
				A1.add(i);// Storing even number in Arraylist
			}
		}
		return A1;

	}

	ArrayList printEvenNumber() {// printEvenNumber methoh As question
		for (int i = 0; i < A1.size(); i++) {
			A2.add((A1.get(i) * 2));// Adding in A2 Which is 2 times in A1
		}
		System.out.println(A2);
		return A2;
	}
public int retrieveEvenNumbers(int N) {// creating method called retriveEvenNumbers
		int n = 0;
		for (int i : A1) {// logic for searching first ArrayList
			if (i == N)
				n = N;
		}
	public static void main(String[] args) {// main method
		StoreEvenNum n = new StoreEvenNum();// object of StoreEvenNum
		n.storeEvenNumber(10);// method calling with pasing parameter
		n.printEvenNumber();
	}
	public static void main(String[] args) {// main method
		Even_number n = new Even_number();// object of StoreEvenNum
		n.storeEvenNumber(10);// method calling with pasing parameter
		n.printEvenNumber();
		n.retrieveEvenNumbers(8);
}
