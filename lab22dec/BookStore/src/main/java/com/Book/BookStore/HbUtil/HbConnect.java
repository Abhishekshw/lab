package com.Book.BookStore.HbUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbConnect {
	private static SessionFactory sessionfactory;// object of session factory
	static {
		try {
			sessionfactory = new Configuration().configure().buildSessionFactory();// connection
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionfactory;
	}

}
