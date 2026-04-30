package com.stack;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stackRef = null; 
        boolean exit = false;

        System.out.println("--- Employee Stack Management ---");

        while (!exit) {
            System.out.println("\n1. Fixed Stack | 2. Growable Stack | 3. Push | 4. Pop | 5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    if (stackRef == null) {
                        stackRef = new FixedStack();
                        System.out.println("Fixed Stack initialized.");
                    } else {
                        System.out.println("Selection already made. You cannot change it.");
                    }
                    break;

                case 2: 
                    if (stackRef == null) {
                        stackRef = new GrowableStack();
                        System.out.println("Growable Stack initialized.");
                    } else {
                        System.out.println("Selection already made. You cannot change it.");
                    }
                    break;

                case 3: 
                    if (stackRef != null) {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter Name: ");
                        String name = sc.next();
                        System.out.print("Enter Salary: ");
                        double sal = sc.nextDouble();
                        
                        stackRef.push(new Employee(id, name, sal));
                    } else {
                        System.out.println("NO stack chosen !!!");
                    }
                    break;

                case 4: 
                    if (stackRef != null) {
                        Employee e = stackRef.pop();
                        if (e != null) {
                            System.out.println("Popped: " + e);
                        }
                    } else {
                        System.out.println("NO stack chosen !!!");
                    }
                    break;

                case 5: 
                    exit = true;
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        sc.close();
    }

}
