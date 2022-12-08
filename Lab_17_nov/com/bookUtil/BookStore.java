package com.bookUtil;

import java.util.ArrayList;

import com.book.Book;

public class BookStore {
	// Creating array list of type Book
	private ArrayList<Book> booklist = new ArrayList<>();

	// This is a method to add books to the array list
	public void addBook(Book b) {
		booklist.add(b);
	}

	// method to search books by title
	public void searchByTitle(String title) {
		if (booklist.stream().anyMatch(b -> {// lamda function
			return title.equalsIgnoreCase(b.getTitle());
		})) {
			System.out.println(booklist);
		} else {
			System.out.println("Title not found!");
		}
	}

	// method to search books by author name
	public void searchByAuthor(String author) {
		if (booklist.stream().anyMatch(b -> {
			return author.equalsIgnoreCase(b.getAuthor());//cheking matched or not
		})) {
			System.out.println(booklist);
		} else {
			System.out.println("Author not found!");
		}
	}

	// method to print all book details
	public void displayAll() {
		for (Book b : booklist) {
			System.out.println("Book-Id is: " + b.getBookId() + " Title is : " + b.getTitle() + " Author is : "
					+ b.getAuthor() + " Category is : " + b.getCategory() + " Price is : " + b.getPrice());
		}

	}
}
