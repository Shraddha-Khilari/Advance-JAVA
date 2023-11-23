package com.sunbeam.beans;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sunbeam.daos.BookDao;
import com.sunbeam.pojos.Book;


public class CartBean {

	public String[] bookids;
	public List<Book>cart;
	public CartBean() {
		cart =new ArrayList<>();
	}
	public String[] getBoooks() {
		return bookids;
	}
	public void setBookids(String[] bookids) {
		this.bookids = bookids;
	}
	public List<Book> getCart() {
		return cart;
	}
	public void setCart(List<Book> cart) {
		this.cart = cart;
	}
		
	public void addtoCart() throws Exception {
		try (BookDao dao = new BookDao()) {
			for (String bookId : bookids) {
				int id=Integer.parseInt(bookId);
				Book b= dao.findById(id);
				this.cart.add(b);
				
			}
		}
	}	
}
