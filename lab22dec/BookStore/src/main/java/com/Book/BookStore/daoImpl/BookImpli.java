package com.Book.BookStore.daoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Book.BookStore.Entity.BookClass;
import com.Book.BookStore.dao.BookDao;

public class BookImpli implements BookDao {

	public void addBook() {// method for adding book
		Session session = com.Book.BookStore.HbUtil.HbConnect.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner S = new Scanner(System.in);
		String Title, Auther;
		int price, bookId;

		System.out.println("enter book name");
		Title = S.next();// taking value from user

		System.out.println("enter Auther book");
		Auther = S.next();
		System.out.println("enter price of  book");
		price = S.nextInt();
		BookClass bk = new BookClass();// object of book class
//setting value
		bk.setTitle(Title);
		bk.setAuther(Auther);
		bk.setPrice(price);
		session.save(bk);
		t.commit();
		System.out.println("Book record save");
		session.close();
	}

	public void fetchBook() {
		try {
			Session session = com.Book.BookStore.HbUtil.HbConnect.getSessionFactory().openSession();// getting
																									// connection
			Scanner S = new Scanner(System.in);
			System.out.println("enter the book name Which you want to search");
			String bkname = S.next();// Storing value
			BookClass bk = session.get(BookClass.class, bkname);
			System.out.println(
					"Book name : " + bk.getTitle() + " Auther : " + bk.getAuther() + " price is :" + bk.getPrice());

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
