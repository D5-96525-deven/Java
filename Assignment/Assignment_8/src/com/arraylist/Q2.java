package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Q2 {
	
	public static List<String> colourList = new ArrayList<>();

	public static void main(String[] args) {
		colourList.add("Red");
		colourList.add("Blue");
		colourList.add("Orange");
		colourList.add("Yellow");
		colourList.add("Black");
		
		System.out.println("Sort Ascending - ");
		
		Collections.sort(colourList);
		
		for(String e : colourList) {
			System.out.println(e);
		}
		
		System.out.println("Sort Descending - ");
		
		class colourListDescendingComparator implements Comparator<String>{
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		}
		
		Collections.sort(colourList, new colourListDescendingComparator());
		
		for(String e : colourList) {
			System.out.println(e);
		}

	}

}
