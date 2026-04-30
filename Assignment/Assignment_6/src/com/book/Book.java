package com.book;

public class Book implements Comparable<Book>{
	private String isbnString;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() {
		this("", 0.0, "", 0);
	}
	
	
	public Book(String isbnString, double price, String authorName, int quantity) {
		this.isbnString = isbnString;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}


	public String getIsbnString() {
		return isbnString;
	}


	public void setIsbnString(String isbnString) {
		this.isbnString = isbnString;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)	return false;
		if(obj == this)	return true;
		if(!(obj instanceof Book))	return false;
		
		Book tempBook = (Book) obj;
		return tempBook.isbnString.equals(this.isbnString);
	}


	@Override
	public int compareTo(Book o) {
		Book book = (Book) o;
		int diff = this.isbnString.compareTo(book.isbnString);
		return diff;
	}
	
	
@Override
	public String toString() {
		return "Book [ISBN=" + isbnString + ", Author name=" + authorName + ", quantity=" + quantity + ", price=" + price + "]";
	}	
	
	
	
}
