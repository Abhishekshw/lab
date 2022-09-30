package lab_sept29;

//Write a Java program to find common elements from three sorted (in
//non-decreasing order) arrays.
import java.util.Arrays;

public class CommonElement {
	public static void main(String[] args) {
		int a[] = { 1, 3, 6, 9, 5, 7, 1 };
		int b[] = { 2, 1, 4, 1, 5, 4, 9 };
		int c[] = { 9, 5, 7, 5, 8, 6, 5 };
		int A[] = new int[a.length];
		int B[] = new int[b.length];
		int C[] = new int[c.length];
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		for (int i = a.length - 1; 0 <= i; i--) {
			A[i] = a[a.length - 1 - i];
		}
		for (int i = b.length - 1; 0 <= i; i--) {
			B[i] = b[b.length - 1 - i];
		}
		for (int i = c.length - 1; 0 <= i; i--) {
			C[i] = c[c.length - 1 - i];
		}

		System.out.println("common element are");
		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < B.length; j++) {

				for (int k = 0; k < C.length; k++) {

					if (A[i] == B[j] && B[j] == C[k]) {
						System.out.println(A[i]);
					}
				}
			}

		}

	}
}
