package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();
		Collections.addAll(arr, 10, 20, 30, 40, 50);
//		Collections.addAll(arr, 10);
		
		System.out.println("Enter new element to replace 2nd element with:");
		Integer n = scanner.nextInt();
		
		if(arr.size() > 1) {
			arr.set(1, n);
		}
		else {
			System.out.println("there is no element at 2nd position.");
		}
		
		for(Integer e : arr) {
			System.out.println(e);
		}

	}

}
