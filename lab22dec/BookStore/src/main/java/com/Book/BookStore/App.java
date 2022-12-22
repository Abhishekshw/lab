package com.Book.BookStore;

import java.util.Scanner;

import com.Book.BookStore.daoImpl.BookImpli;

public class App {
	static char ans;

	public static void main(String[] args) {// main method
		Scanner S = new Scanner(System.in);// Scanner obj
		System.out.println("Enter your choice");
		System.out.println("welcome to BookStore System");

		BookImpli B = new BookImpli();
		do {
			System.out.println("1.add book \n 2.see record \n 3.exist");// menu option
			int ch = S.nextInt();
			switch (ch) {
			case 1:
				B.addBook();
				break;
			case 2:
				B.fetchBook();
				break;
			case 3:
				System.exit(0);
				break;
			}
			System.out.println("do you want to process again? y/n");
			ans = S.next().charAt(0);
		} while (ans == 'y' || ans == 'Y');
		{
			System.out.println("thank you");
		}
	}
}
