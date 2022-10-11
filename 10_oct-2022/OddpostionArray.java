package Array;

//Q3 print the Element which avaible in odd posion
public class OddpostionArray {
	public static void main(String[] args) {
		int a[] = { 50, 74, 8, 5, 7, 1, 2, 6, 85, 79 };
		System.out.println("odd posision array is");
		for (int i = 0; i < a.length; i++, i++) {
			System.out.print(a[i] + " ");
		}
	}
}
