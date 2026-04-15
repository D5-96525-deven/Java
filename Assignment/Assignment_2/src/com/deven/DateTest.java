package com.deven;

public class DateTest {

	    public static void main(String[] args) {

	    	Date today = new Date(02, 06, 2003);

	        System.out.print("Initial date: ");
	        today.displayDate();

	        today.setMonth(06);
	        today.setDay(14);
	        today.setYear(2024);

	        System.out.println("Updated Year: " + today.getYear());
	        
	        System.out.print("Final date: ");
	        today.displayDate();
	    }
	}

