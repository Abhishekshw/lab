package com.Book.BookStore.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Book") // this is the name of table
public class BookClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private String title;// colomn name
	@Column
	private String Auther;
	@Column
	private int price;
}
