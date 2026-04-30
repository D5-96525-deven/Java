package com.book;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortBooksByPrice implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getPrice() == o2.getPrice())	return 0;
		else if(o1.getPrice() < o2.getPrice())	return 1;
		else return -1;
		
	}
}

public class Program {
	public static List<Book> bookList = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);
	
	public static void addNewBook() {
		Book b = new Book();
		
		System.out.println("Enter book isbn : ");
		scanner.nextLine();
		String isbnString = scanner.nextLine();
		b.setIsbnString(isbnString);
		
		System.out.println("Enter book price : ");
		double price = scanner.nextDouble();
		b.setPrice(price);
		
		System.out.println("Enter book author name : ");
		scanner.nextLine();
		String authorString  = scanner.nextLine();
		b.setAuthorName(authorString);
		
		System.out.println("Enter book quantity : ");
		int quantity = scanner.nextInt();
		b.setQuantity(quantity);
		
		
		bookList.add(b);
	}
	
	public static int menuList() {
		int choice;
		System.out.println("0. Exit");
		System.out.println("1. Add new book");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Display all books in reverse order");
		System.out.println("4. Delete book at given index");
		System.out.println("5. Sort all books by price in descending order");
		System.out.println("Enter your choice : ");
		choice = scanner.nextInt();
		
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		
		while((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				addNewBook();
				System.out.println("Book Added to List.");
				break;
				
			case 2:
				Collections.sort(bookList);
				for(Book book : bookList) {
					System.out.println(book.toString());
				}
				break;
			case 3:
				ListIterator<Book> trav = bookList.listIterator(bookList.size());
				while(trav.hasPrevious()) {
					Book bk = trav.previous();
					System.out.println(bk.toString());
				}
				break;
			case 4:
				System.out.println("Enter index to delete...");
				int idx = scanner.nextInt();
				bookList.remove(idx);
				break;
				
			case 5:
				Comparator<Book> comparator = new SortBooksByPrice();
				Collections.sort(bookList, comparator);
				for(Book book : bookList) {
					System.out.println(book.toString());
				}
				break;
				
			}
			
		}
		
		System.out.println("Exiting ....");
		
		
		

	}

}
